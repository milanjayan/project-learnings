package com.example.projectlearnings.testhybernateinheritances.tableperclass;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "table_per_instructor")
public class Instructor extends User {
    private String specialization;
    private Double rating;
}
