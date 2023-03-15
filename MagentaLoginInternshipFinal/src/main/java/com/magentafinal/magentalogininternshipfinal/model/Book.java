package com.magentafinal.magentalogininternshipfinal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "Books") //Student
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    private String genre;

    @JsonIgnore
    @ManyToMany(mappedBy = "readingPreferences")
    private List<User> users = new ArrayList<>();

}