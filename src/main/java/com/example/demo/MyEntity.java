package com.example.demo;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Table(name = "myentity")
@Entity
@Data
public class MyEntity {

    @Id
    @GeneratedValue
    private Integer id;

    private double value;

    private String description;
}
