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
    public void updateHabit(Long habitId, String name, Integer year, String month, Boolean day1, Boolean day2,
                            Boolean day3, Boolean day4, Boolean day5, Boolean day6, Boolean day7, Boolean day8,
                            Boolean day9, Boolean day10, Boolean day11, Boolean day12, Boolean day13, Boolean day14,
                            Boolean day15, Boolean day16, Boolean day17, Boolean day18, Boolean day19, Boolean day20,
                            Boolean day21, Boolean day22, Boolean day23, Boolean day24, Boolean day25, Boolean day26,
                            Boolean day27, Boolean day28, Boolean day29, Boolean day30, Boolean day31) {

        Habit habit = habitRepository.findById(habitId).orElseThrow(() ->
                new IllegalStateException(
                        "habit with id " + habitId + " does not exist!"
                ));

        if (name != null && name.length() > 0 && !Objects.equals(habit.getName(), name)) {
            habit.setName(name);
        }

        if (year != null && (year < 2050 && year > 2022)) {
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

        if (day1 != null) {
            habit.setDay1(day1);
        }
        if (day2 != null) {
            habit.setDay2(day2);
        }
        if (day3 != null) {
            habit.setDay3(day3);
        }
        if (day4 != null) {
            habit.setDay4(day4);
        }
        if (day5 != null) {
            habit.setDay5(day5);
        }
        if (day6 != null) {
            habit.setDay6(day6);
        }
        if (day7 != null) {
            habit.setDay7(day7);
        }
        if (day8 != null) {
            habit.setDay8(day8);
        }
        if (day9 != null) {
            habit.setDay9(day9);
        }
        if (day10 != null) {
            habit.setDay10(day10);
        }
        if (day11 != null) {
            habit.setDay11(day11);
        }
        if (day12 != null) {
            habit.setDay12(day12);
        }
        if (day13 != null) {
            habit.setDay13(day13);
        }
        if (day14 != null) {
            habit.setDay14(day14);
        }
        if (day15 != null) {
            habit.setDay15(day15);
        }
        if (day16 != null) {
            habit.setDay16(day16);
        }
        if (day17 != null) {
            habit.setDay17(day17);
        }
        if (day18 != null) {
            habit.setDay18(day18);
        }
        if (day19 != null) {
            habit.setDay19(day19);
        }
        if (day20 != null) {
            habit.setDay20(day20);
        }
        if (day21 != null) {
            habit.setDay21(day21);
        }
        if (day22 != null) {
            habit.setDay22(day22);
        }
        if (day23 != null) {
            habit.setDay23(day23);
        }
        if (day24 != null) {
            habit.setDay24(day24);
        }
        if (day25 != null) {
            habit.setDay25(day25);
        }
        if (day26 != null) {
            habit.setDay26(day26);
        }
        if (day27 != null) {
            habit.setDay27(day27);
        }
        if (day28 != null) {
            habit.setDay28(day28);
        }
        if (day29 != null) {
            habit.setDay29(day29);
        }
        if (day30 != null) {
            habit.setDay30(day30);
        }
        if (day31 != null) {
            habit.setDay31(day31);
        }
    }
}
