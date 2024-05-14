package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "organizations")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long organizationId;

    @Column(name = "Name", nullable = false, length = 255)
    private String name;

    @Column(name = "Email", nullable = false, length = 255)
    private String email;

    @Column(name = "Account", nullable = false, length = 255)
    private String account;

    @Column(name = "Password", nullable = false, length = 255)
    private String password;

    // Constructors
    public Organization() {
    }

    public Organization(Long organizationId, String name, String email, String account, String password) {
        this.organizationId = organizationId;
        this.name = name;
        this.email = email;
        this.account = account;
        this.password = password;
    }

    // Getters and Setters
    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
