package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "holding")
public class Holding {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long holdingId;

    @Column(name = "OrganizationID", nullable = false)
    private Long organizationId;

    @Column(name = "EventID", nullable = false)
    private Long eventId;

    @Column(name = "Status", nullable = false)
    private String status;

    // Constructors
    public Holding() {
    }

    public Holding(Long holdingId, Long organizationId, Long eventId, String status) {
        this.holdingId = holdingId;
        this.organizationId = organizationId;
        this.eventId = eventId;
        this.status = status;
    }

    // Getters and Setters
    public Long getHoldingId() {
        return holdingId;
    }

    public void setHoldingId(Long holdingId) {
        this.holdingId = holdingId;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
