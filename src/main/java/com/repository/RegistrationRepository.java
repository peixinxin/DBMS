package com.example.demo.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    List<Registration> findAll();

    List<Registration> findByVolunteerId(Long volunteerId);

    List<Registration> findByEventId(Long eventId);

    List<Registration> findByAuditStatus(String auditStatus);
}
