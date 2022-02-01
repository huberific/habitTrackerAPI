package com.example.habitTracker.habit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HabitRepository extends JpaRepository<Habit, Long>{

    @Query("SELECT h FROM Habit h WHERE h.month = ?1")
    Optional<Habit> findHabitByMonth(String month);
}
