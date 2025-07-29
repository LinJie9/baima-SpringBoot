package org.example.baimaspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    int id;
    String name;
    String email;
    String password;
}
