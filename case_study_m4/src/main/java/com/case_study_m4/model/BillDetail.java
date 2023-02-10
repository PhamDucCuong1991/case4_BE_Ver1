package com.case_study_m4.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BillDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBillDetail;
    private int amount;
    @ManyToOne
    private Bill bill;
    @ManyToOne
    private Product product;
}
