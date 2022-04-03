package com.sovliv.firstprojectwithliquibase.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, length = 100)
    String title;

    @Column(nullable = false)
    String text;

    @ManyToOne
    Author author;
}
