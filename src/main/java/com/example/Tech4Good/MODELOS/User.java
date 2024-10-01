package com.example.Tech4Good.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name="User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @Column(name = "userName", nullable = false)
    private String userName;

    @Column(name = "passwordUser", nullable = false)
    private String passwordUser;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "userRole", nullable = false)
    private String userRole;

    public User() {
    }

    public User(Long idUser, String userName, String passwordUser, String email, String userRole) {
        this.idUser = idUser;
        this.userName = userName;
        this.passwordUser = passwordUser;
        this.email = email;
        this.userRole = userRole;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
