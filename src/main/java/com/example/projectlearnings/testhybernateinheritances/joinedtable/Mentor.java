package com.example.projectlearnings.testhybernateinheritances.joinedtable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "join_mentor")
public class Mentor extends User {
    private String company;
    private Double rating;
}
