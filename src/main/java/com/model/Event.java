package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventId;

    @Column(name = "Name", nullable = false, length = 255)
    private String name;

    @Column(name = "Description", nullable = false, length = 500)
    private String description;

    @Column(name = "Location", nullable = false, length = 255)
    private String location;

    @Column(name = "Supervise", nullable = false, length = 255)
    private String supervise;

    @Column(name = "Status", nullable = false, length = 255)
    private String status;

    @Column(name = "Category", nullable = false, length = 255)
    private String category;

    @Column(name = "Start_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Column(name = "End_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    // Constructors
    public Event() {
    }

    public Event(Long eventId, String name, String description, String location, String supervise, String status,
                 String category, Date startDate, Date endDate) {
        this.eventId = eventId;
        this.name = name;
        this.description = description;
        this.location = location;
        this.supervise = supervise;
        this.status = status;
        this.category = category;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and Setters
    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSupervise() {
        return supervise;
    }

    public void setSupervise(String supervise) {
        this.supervise = supervise;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
