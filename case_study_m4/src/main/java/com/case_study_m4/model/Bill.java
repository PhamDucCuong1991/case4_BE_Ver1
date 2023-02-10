package com.case_study_m4.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBill;
    private String date;

    @ManyToOne
    private User user;
}
