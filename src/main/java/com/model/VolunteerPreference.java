package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "volunteer_preferences")
public class VolunteerPreference {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "volunteer_id", referencedColumnName = "id", nullable = false)
    private Volunteer volunteer;

    @Column(name = "preference", nullable = false, length = 255)
    private String preference;

    public VolunteerPreference() {
    }

    public VolunteerPreference(Long id, Volunteer volunteer, String preference) {
        this.id = id;
        this.volunteer = volunteer;
        this.preference = preference;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }
}
