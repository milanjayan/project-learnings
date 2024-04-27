package com.example.projectlearnings.testhybernateinheritances.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("3")
public class Ta extends User {
    private Integer sessions;
    private Double rating;
}


