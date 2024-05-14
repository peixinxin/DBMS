package com.example.demo.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VolunteerRepository extends JpaRepository<Volunteer, Integer> {
    List<Volunteer> findAll();

    List<Volunteer> findByUserId(Long userId);

    List<Volunteer> findByNameContaining(String keyword);
}
