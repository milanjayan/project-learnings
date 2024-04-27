package com.example.projectlearnings.testhybernateinheritances.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "table_per_Ta")
public class Ta extends User {
    private Integer sessions;
    private Double rating;
}


