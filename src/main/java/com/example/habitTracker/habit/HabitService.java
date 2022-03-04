package com.example.habitTracker.habit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class HabitService {

    private final HabitRepository habitRepository;

    @Autowired
    public HabitService(HabitRepository habitRepository) {
        this.habitRepository = habitRepository;
    }

    public List<Habit> getHabits() {
        return habitRepository.findAll();
    }

    public List<Habit> getHabits(String year, String month) {
        return habitRepository.findHabitByYearAndMonth(year, month);
    }

    public void addNewHabit(Habit habit) {
        /* don't allow duplicates? TODO? */
        habitRepository.save(habit);
    }

    public void deleteHabit(Long habitId) {
        boolean habitExists = habitRepository.existsById(habitId);
        if (!habitExists) {
            throw new IllegalStateException(
                    "habit with id " + habitId + " does not exist!"
            );
        }
        habitRepository.deleteById(habitId);
    }

    @Transactional
    public void updateHabit(String year, String month, String habitNum, String name, Integer day) {

        Optional<Habit> habit;

        try {
            habit = habitRepository.findHabitByHabitNumAndYearAndMonth(habitNum, year, month);
            System.out.println(habit);
        } catch (IllegalStateException ise) {
            System.out.println("habit doesn't exist:");
            System.out.println("habit num: " + habitNum);
            System.out.println("habit year: " + year);
            System.out.println("habit month: " + month);
            return;
        }

        int habitNumber = Integer.parseInt(habitNum);

        final int NUMBER_OF_HABITS = 3;

        if (habitNumber > 0 && habitNumber <= NUMBER_OF_HABITS) {
            habit.ifPresent(habitObj -> habitObj.setHabitNum(habitNum));
        }

        if (name != null && name.length() > 0) {
            habit.ifPresent(habitObj -> {
                if (!Objects.equals(habitObj.getName(), name)) {
                    habitObj.setName(name);
                }
            });
        }

        if (year != null && (Integer.parseInt(year) < 2050 && Integer.parseInt(year) > 2022)) {
            habit.ifPresent(habitObj -> habitObj.setYear(year));
        }

        if (month != null && (month.equals("January") || month.equals("February") ||
                month.equals("March") || month.equals("April") ||
                month.equals("May") || month.equals("June") ||
                month.equals("July") || month.equals("August") ||
                month.equals("September") || month.equals("October") ||
                month.equals("November") || month.equals("December"))) {
            habit.ifPresent(habitObj -> habitObj.setMonth(month));
        }

        if (day != null && day > 0 && day < 32)
            habit.ifPresent(habitObj -> habitObj.setDay(day));
    }
}
