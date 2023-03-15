package com.magentafinal.magentalogininternshipfinal.controller;

import com.magentafinal.magentalogininternshipfinal.model.Book;
import com.magentafinal.magentalogininternshipfinal.model.User;
import com.magentafinal.magentalogininternshipfinal.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BookController {

    private final BookRepository bookRepository;
    @GetMapping("/books")
    List<Book> getBooks() { return bookRepository.findAll(); }

    @PostMapping("/books")
    Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }
}
