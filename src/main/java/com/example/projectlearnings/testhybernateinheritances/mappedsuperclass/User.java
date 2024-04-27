package com.example.projectlearnings.testhybernateinheritances.mappedsuperclass;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
abstract class User {
    @Id
    private Long id;
    private String email;
    private String password;
}
