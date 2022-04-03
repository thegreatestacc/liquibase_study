package com.sovliv.firstprojectwithliquibase.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(nullable = false)
    String name;
}
