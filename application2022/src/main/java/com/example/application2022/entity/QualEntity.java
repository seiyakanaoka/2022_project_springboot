package com.example.application2022.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "quals")
public class QualEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String title;
}
