package com.magentafinal.magentalogininternshipfinal.repository;

import com.magentafinal.magentalogininternshipfinal.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
