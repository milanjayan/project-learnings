package com.example.projectlearnings.testhybernateinheritances.singletable;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("1")
public class Instructor extends User {
    private String specialization;
    private Double rating;
}
