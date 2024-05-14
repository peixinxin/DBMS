package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "supervisor")
public class Supervisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supervisorId;

    @Column(name = "Email", nullable = false, length = 45)
    private String email;

    @Column(name = "Account", nullable = false, length = 45)
    private String account;

    @Column(name = "Password", nullable = false, length = 45)
    private String password;

    @Column(name = "Name", length = 45)
    private String name;

    // Constructors
    public Supervisor() {
    }

    public Supervisor(Integer supervisorId, String email, String account, String password, String name) {
        this.supervisorId = supervisorId;
        this.email = email;
        this.account = account;
        this.password = password;
        this.name = name;
    }

    // Getters and Setters
    public Integer getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Integer supervisorId) {
        this.supervisorId = supervisorId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
