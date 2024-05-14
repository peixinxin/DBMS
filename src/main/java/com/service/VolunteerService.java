package com.example.demo.service;

import com.example.demo.model.Volunteer;
import com.example.demo.repository.VolunteerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VolunteerService {

    private final VolunteerRepository volunteerRepository;

    public VolunteerService(VolunteerRepository volunteerRepository) {
        this.volunteerRepository = volunteerRepository;
    }

    public List<Volunteer> getVolunteers() {
        return volunteerRepository.findAll();
    }

    public Optional<Volunteer> getVolunteerById(Integer id) {
        return volunteerRepository.findById(id);
    }

    // 根據使用者ID查找志願者
    public List<Volunteer> getVolunteersByUserId(Long userId) {
        return volunteerRepository.findByUserId(userId);
    }

    // 根據姓名模糊查找志願者
    public List<Volunteer> getVolunteersByName(String keyword) {
        return volunteerRepository.findByNameContaining(keyword);
    }

    // 創建志願者
    public Volunteer createVolunteer(Volunteer volunteer) {
        return volunteerRepository.save(volunteer);
    }

    // 更新志願者信息
    public Volunteer updateVolunteer(Volunteer volunteer) {
        return volunteerRepository.save(volunteer);
    }

    // 刪除志願者
    public void deleteVolunteer(Integer id) {
        volunteerRepository.deleteById(id);
    }
}
