package com.example.demo.duplicated.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "author")
@Entity
@Data
public class Author {
    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "author")
    private List<Book> books;
}
