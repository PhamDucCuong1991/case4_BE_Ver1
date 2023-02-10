package com.case_study_m4.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    private String username;
    private String password;
    private String avatar;
    private String address;
    private String phone;

    @ManyToOne
    private Role role;
}
