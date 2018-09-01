package com.example.demo.objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "INFO", catalog = "UserDB", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID"),
        @UniqueConstraint(columnNames = "USERNAME"),
        @UniqueConstraint(columnNames = "EMAIL")
})

public class User {
    @Column(name = "id", nullable = false, length = 100)
    private int id;
    @Column(name = "username", nullable = false, length = 100)
    private String username;
    @Column(name = "pass", nullable = false, length = 100)
    private String password;
    @Column(name = "firstname", nullable = false, length = 100)
    private String firstName;
    @Column(name = "lastname", nullable = false, length = 100)
    private String lastName;
    @Column(name = "email", nullable = false, length = 100)
    private String email;

    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
