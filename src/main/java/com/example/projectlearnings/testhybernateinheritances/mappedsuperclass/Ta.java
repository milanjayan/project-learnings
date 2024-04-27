package com.example.projectlearnings.testhybernateinheritances.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "msc_ta")
public class Ta extends User {
    private Integer sessions;
    private Double rating;
}


