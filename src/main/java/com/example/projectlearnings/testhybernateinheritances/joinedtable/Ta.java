package com.example.projectlearnings.testhybernateinheritances.joinedtable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "join_ta")
public class Ta extends User {
    private Integer sessions;
    private Double rating;
}


