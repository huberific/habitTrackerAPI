package com.example.habitTracker.habit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin // needed for front end site to be on one port (3000) and api on the other (8080)
@RequestMapping(path = "api/habits")
public class HabitController {

    private final HabitService habitService;

    @Autowired
    public HabitController(HabitService habitService) {
        this.habitService = habitService;
    }

    @GetMapping(path = "/{year}/{month}")
    public List<Habit> getHabits(@PathVariable ("year") String year, @PathVariable("month") String month) {
       return habitService.getHabits(year, month) ;
    }

    @PostMapping
    public void registerNewHabit(@RequestBody Habit habit) {
        habitService.addNewHabit(habit);
    }

    @DeleteMapping(path = "{habitId}")
    public void deleteHabit(@PathVariable("habitId") Long habitId) {
        habitService.deleteHabit(habitId);
    }

    @PutMapping(path = "/{year}/{month}/{habitNum}")
    public void updateHabit(
            @PathVariable("year") String year,
            @PathVariable("month") String month,
            @PathVariable("habitNum") String habitNum,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer day) {
        habitService.updateHabit(year, month, habitNum, name, day);
    }
}
