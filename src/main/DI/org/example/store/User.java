package org.example.store;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

import java.net.ProtocolFamily;

@Setter
@Getter
@Builder
public class User {
    // Setter for id
    // Getter for id
    // Private fields
    private Long id;
    // Setter for email
    // Getter for email
    private String email;
    // Setter for password
    // Getter for password
    private String password;
    // Setter for name
    // Getter for name
    private String name;

    // Constructor
    public User(Long id, String email, String password, String name) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public static ProtocolFamily builder() {
        return null;
    }

    // Getters and Setters

    // toString method for debugging and logging
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
