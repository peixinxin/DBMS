package com.example.demo.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Supervisor;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SupervisorRepository extends JpaRepository<Supervisor, Integer> {
    List<Supervisor> findAll();

    List<Supervisor> findByUserId(Long userId);

    List<Supervisor> findByNameContaining(String keyword);
}
