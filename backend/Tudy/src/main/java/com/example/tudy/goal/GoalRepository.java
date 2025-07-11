package com.example.tudy.goal;

import com.example.tudy.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoalRepository extends JpaRepository<Goal, Long> {
    List<Goal> findByUser(User user);
    List<Goal> findByUserAndCategory(User user, String category);
    List<Goal> findByUserAndStartDateLessThanEqualAndEndDateGreaterThanEqual(User user, java.time.LocalDate date1, java.time.LocalDate date2);
}