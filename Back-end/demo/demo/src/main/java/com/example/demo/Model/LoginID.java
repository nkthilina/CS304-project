package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="LoginDetails")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginID {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="loginId")
    private int loginId;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;
}
