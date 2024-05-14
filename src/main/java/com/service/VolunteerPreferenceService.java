package com.example.demo.service;

import com.example.demo.model.VolunteerPreference;
import com.example.demo.repository.VolunteerPreferenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VolunteerPreferenceService {

    private final VolunteerPreferenceRepository volunteerPreferenceRepository;

    public VolunteerPreferenceService(VolunteerPreferenceRepository volunteerPreferenceRepository) {
        this.volunteerPreferenceRepository = volunteerPreferenceRepository;
    }

    // 獲取所有志工偏好
    public List<VolunteerPreference> getVolunteerPreferences() {
        return volunteerPreferenceRepository.findAll();
    }

    // 根據ID獲取志工偏好
    public Optional<VolunteerPreference> getVolunteerPreferenceById(Long id) {
        return volunteerPreferenceRepository.findById(id);
    }

    // 根據志工ID獲取志工偏好
    public List<VolunteerPreference> getVolunteerPreferencesByVolunteerId(Long volunteerId) {
        return volunteerPreferenceRepository.findByVolunteerId(volunteerId);
    }

    // 創建新的志工偏好
    public VolunteerPreference createVolunteerPreference(VolunteerPreference volunteerPreference) {
        return volunteerPreferenceRepository.save(volunteerPreference);
    }

    // 更新志工偏好
    public VolunteerPreference updateVolunteerPreference(VolunteerPreference volunteerPreference) {
        return volunteerPreferenceRepository.save(volunteerPreference);
    }

    // 刪除志工偏好
    public void deleteVolunteerPreference(Long id) {
        volunteerPreferenceRepository.deleteById(id);
    }
}
