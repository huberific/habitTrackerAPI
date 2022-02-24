package com.example.habitTracker.habit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class HabitConfig {

    @Bean
    CommandLineRunner commandLineRunner(HabitRepository repository) {
        return args -> {
            Habit myHabit1 = new Habit(
                    "meditate", "2022", "January",
                    true, true, true, false, true, false, true, false,
                    false, false, true, true, true, false, true, false,
                    true, true, true, false, true, false, true, true,
                    false, false, false, true, true, true, false
            );

            Habit myHabit2 = new Habit(
                    "practice coding", "2022", "February",
                    false, false, false, false, true, false, false, false,
                    false, false, false, false, false, true, false, true,
                    true, false, true, true, true, true, false, true,
                    false, false, false, false, false, false, true
            );

            Habit myHabit3 = new Habit(
                    "100 pushups", "2022", "January",
                    true, true, true, true, true, true, true, true,
                    true, true, true, true, false, true, true, true,
                    true, true, false, true, true, true, false, true,
                    true, false, true, false, true, true, true
            );

            repository.saveAll(List.of(myHabit1, myHabit2, myHabit3));
        };
    }
}
