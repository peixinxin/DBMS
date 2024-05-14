package com.example.demo.service;

import com.example.demo.model.Registration;
import com.example.demo.repository.RegistrationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationService {

    private final RegistrationRepository registrationRepository;

    public RegistrationService(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    // 獲取所有報名記錄
    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }

    // 根據志願者ID獲取相關的報名記錄
    public List<Registration> getRegistrationsByVolunteerId(Long volunteerId) {
        return registrationRepository.findByVolunteerId(volunteerId);
    }

    // 根據活動ID獲取相關的報名記錄
    public List<Registration> getRegistrationsByEventId(Long eventId) {
        return registrationRepository.findByEventId(eventId);
    }

    // 根據審核狀態獲取相關的報名記錄
    public List<Registration> getRegistrationsByAuditStatus(String auditStatus) {
        return registrationRepository.findByAuditStatus(auditStatus);
    }

    // 創建新的報名記錄
    public Registration createRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    // 更新指定ID的報名記錄
    public Registration updateRegistration(Long id, Registration registrationDetails) {
        return registrationRepository.findById(id)
                .map(registration -> {
                    registration.setVolunteerId(registrationDetails.getVolunteerId());
                    registration.setEventId(registrationDetails.getEventId());
                    registration.setAuditStatus(registrationDetails.getAuditStatus());
                    return registrationRepository.save(registration);
                })
                .orElseThrow(() -> new RuntimeException("Registration not found with id " + id));
    }

    // 刪除指定ID的報名記錄
    public void deleteRegistration(Long id) {
        registrationRepository.deleteById(id);
    }
}
