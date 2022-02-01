package com.example.habitTracker.habit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200") // needed for angular site to be on one port (4200) and api on the other (8080)
@RequestMapping(path = "api/habits")
public class HabitController {

    private final HabitService habitService;

    @Autowired
    public HabitController(HabitService habitService) {
        this.habitService = habitService;
    }

    @GetMapping
    public List<Habit> getHabits() {
        return habitService.getHabits();
    }

    @PostMapping
    public void registerNewHabit(@RequestBody Habit habit) {
        habitService.addNewHabit(habit);
    }

    @DeleteMapping(path = "{habitId}")
    public void deleteHabit(@PathVariable("habitId") Long habitId) {
        habitService.deleteHabit(habitId);
    }

    @PutMapping(path = "{habitId}")
    public void updateHabit(
            @PathVariable("habitId") Long habitId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer year,
            @RequestParam(required = false) String month,
            @RequestParam(required = false) Boolean day1,
            @RequestParam(required = false) Boolean day2,
            @RequestParam(required = false) Boolean day3,
            @RequestParam(required = false) Boolean day4,
            @RequestParam(required = false) Boolean day5,
            @RequestParam(required = false) Boolean day6,
            @RequestParam(required = false) Boolean day7,
            @RequestParam(required = false) Boolean day8,
            @RequestParam(required = false) Boolean day9,
            @RequestParam(required = false) Boolean day10,
            @RequestParam(required = false) Boolean day11,
            @RequestParam(required = false) Boolean day12,
            @RequestParam(required = false) Boolean day13,
            @RequestParam(required = false) Boolean day14,
            @RequestParam(required = false) Boolean day15,
            @RequestParam(required = false) Boolean day16,
            @RequestParam(required = false) Boolean day17,
            @RequestParam(required = false) Boolean day18,
            @RequestParam(required = false) Boolean day19,
            @RequestParam(required = false) Boolean day20,
            @RequestParam(required = false) Boolean day21,
            @RequestParam(required = false) Boolean day22,
            @RequestParam(required = false) Boolean day23,
            @RequestParam(required = false) Boolean day24,
            @RequestParam(required = false) Boolean day25,
            @RequestParam(required = false) Boolean day26,
            @RequestParam(required = false) Boolean day27,
            @RequestParam(required = false) Boolean day28,
            @RequestParam(required = false) Boolean day29,
            @RequestParam(required = false) Boolean day30,
            @RequestParam(required = false) Boolean day31) {

        habitService.updateHabit(habitId, name, year, month, day1, day2, day3, day4,
                day5, day6, day7, day8, day9, day10, day11, day12,
                day13, day14, day15, day16, day17, day18, day19, day20,
                day21, day22, day23, day24, day25, day26, day27, day28,
                day29, day30, day31
        );
    }
}
