package com.example.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "volunteer")
public class Volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer volunteerId;

    @Column(name = "Email", nullable = false, length = 45)
    private String email;

    @Column(name = "Name", nullable = false, length = 45)
    private String name;

    @Column(name = "Gender", nullable = false, length = 45)
    private String gender;

    @Column(name = "Past_record", nullable = false, length = 45)
    private String pastRecord;

    @Column(name = "Preference", nullable = false, length = 45)
    private String preference;

    @Column(name = "Introduction", nullable = false, length = 200)
    private String introduction;

    @Column(name = "Account", nullable = false, length = 45)
    private String account;

    @Column(name = "Password", nullable = false, length = 45)
    private String password;

    // Constructors
    public Volunteer() {
    }

    public Volunteer(Integer volunteerId, String email, String name, String gender, String pastRecord, String preference, String introduction, String account, String password) {
        this.volunteerId = volunteerId;
        this.email = email;
        this.name = name;
        this.gender = gender;
        this.pastRecord = pastRecord;
        this.preference = preference;
        this.introduction = introduction;
        this.account = account;
        this.password = password;
    }
    

    // Getters and Setters
     // Getters and Setters
     public Integer getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(Integer volunteerId) {
        this.volunteerId = volunteerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPastRecord() {
        return pastRecord;
    }

    public void setPastRecord(String pastRecord) {
        this.pastRecord = pastRecord;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
