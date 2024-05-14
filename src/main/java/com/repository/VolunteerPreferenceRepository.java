package com.example.demo.repository;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.demo.model.VolunteerPreference;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VolunteerPreferenceRepository extends JpaRepository<VolunteerPreference, Long> {
    List<VolunteerPreference> findAll();

    List<VolunteerPreference> findByVolunteerId(Long volunteerId);

    List<VolunteerPreference> findByPreferenceContaining(String keyword);
}
