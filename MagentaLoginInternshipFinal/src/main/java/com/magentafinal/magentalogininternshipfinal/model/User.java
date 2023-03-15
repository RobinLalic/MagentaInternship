package com.magentafinal.magentalogininternshipfinal.model;

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
@Table(name = "Users") //Subject
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private int age;

    @ManyToMany
    @JoinTable(
            name = "user_preferences",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<Book> readingPreferences = new ArrayList<>();
}

