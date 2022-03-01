package com.example.habitTracker.habit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

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
    public void updateHabit(Long habitId, String name, String year, String month, Integer day) {

        Habit habit = habitRepository.findById(habitId).orElseThrow(() ->
                new IllegalStateException(
                        "habit with id " + habitId + " does not exist!"
                ));

        if (name != null && name.length() > 0 && !Objects.equals(habit.getName(), name)) {
            habit.setName(name);
        }

        if (year != null && (Integer.parseInt(year) < 2050 && Integer.parseInt(year) > 2022)) {
            habit.setYear(year);
        }

        if (month != null && (month.equals("January") || month.equals("February") ||
                month.equals("March") || month.equals("April") ||
                month.equals("May") || month.equals("June") ||
                month.equals("July") || month.equals("August") ||
                month.equals("September") || month.equals("October") ||
                month.equals("November") || month.equals("December"))) {
            habit.setMonth(month);
        }

        if(day != null && day > 0 && day < 32)
            habit.setDay(day);
    }
}
