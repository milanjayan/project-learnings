package com.example.projectlearnings.testhybernateinheritances.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("2")
public class Mentor extends  User {
    private String company;
    private Double rating;
}
