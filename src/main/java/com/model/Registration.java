package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registrationId;

    @Column(name = "Volunteer_ID")
    private Long volunteerId;

    @Column(name = "EventID")
    private Long eventId;

    @Column(name = "Audit_Status")
    private String auditStatus;

    // Constructors
    public Registration() {
    }

    public Registration(Long volunteerId, Long eventId, String auditStatus) {
        this.volunteerId = volunteerId;
        this.eventId = eventId;
        this.auditStatus = auditStatus;
    }

    // Getters and Setters
    public Long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Long registrationId) {
        this.registrationId = registrationId;
    }

    public Long getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(Long volunteerId) {
        this.volunteerId = volunteerId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }
}
