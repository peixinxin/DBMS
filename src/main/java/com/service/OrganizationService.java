package com.example.demo.service;

import com.example.demo.model.Organization;
import com.example.demo.repository.OrganizationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizationService {

    private final OrganizationRepository organizationRepository;

    public OrganizationService(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    // 獲取所有組織
    public List<Organization> getAllOrganizations() {
        return organizationRepository.findAll();
    }

    // 根據ID查找組織
    public Optional<Organization> getOrganizationById(Long id) {
        return organizationRepository.findById(id);
    }

    // 創建新組織
    public Organization createOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }

    // 更新組織信息
    public Organization updateOrganization(Long id, Organization organizationDetails) {
        return organizationRepository.findById(id)
                .map(organization -> {
                    organization.setName(organizationDetails.getName());
                    organization.setEmail(organizationDetails.getEmail());
                    organization.setAccount(organizationDetails.getAccount());
                    organization.setPassword(organizationDetails.getPassword());
                    return organizationRepository.save(organization);
                })
                .orElseThrow(() -> new RuntimeException("Organization not found with id " + id));
    }

    // 刪除組織
    public void deleteOrganization(Long id) {
        organizationRepository.deleteById(id);
    }
}
