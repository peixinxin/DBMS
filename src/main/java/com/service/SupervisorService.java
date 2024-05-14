package com.example.demo.service;

import com.example.demo.model.Supervisor;
import com.example.demo.repository.SupervisorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupervisorService {

    private final SupervisorRepository supervisorRepository;

    public SupervisorService(SupervisorRepository supervisorRepository) {
        this.supervisorRepository = supervisorRepository;
    }

    // 獲取所有監督員
    public List<Supervisor> getSupervisors() {
        return supervisorRepository.findAll();
    }

    // 根據ID獲取監督員
    public Optional<Supervisor> getSupervisorById(Integer id) {
        return supervisorRepository.findById(id);
    }

    // 創建新的監督員
    public Supervisor createSupervisor(Supervisor supervisor) {
        return supervisorRepository.save(supervisor);
    }

    // 更新監督員信息
    public Supervisor updateSupervisor(Supervisor supervisor) {
        return supervisorRepository.save(supervisor);
    }

    // 刪除監督員
    public void deleteSupervisor(Integer id) {
        supervisorRepository.deleteById(id);
    }
}
