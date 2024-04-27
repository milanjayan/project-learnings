package com.example.projectlearnings.testhybernateinheritances.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "table_per_mentor")
public class Mentor extends User {
    private String company;
    private Double rating;
}
