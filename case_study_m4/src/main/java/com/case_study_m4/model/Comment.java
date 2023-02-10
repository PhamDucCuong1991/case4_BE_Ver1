package com.case_study_m4.model;



import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComment;
    public String content;

    @ManyToOne
    private User user;
    @ManyToOne
    private Product product;
}
