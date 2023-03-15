package com.magentafinal.magentalogininternshipfinal.controller;

import com.magentafinal.magentalogininternshipfinal.model.Book;
import com.magentafinal.magentalogininternshipfinal.model.User;
import com.magentafinal.magentalogininternshipfinal.repository.BookRepository;
import com.magentafinal.magentalogininternshipfinal.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;
    @GetMapping("/books")
    List<Book> getBooks() { return bookService.getBooks(); }

    @PostMapping("/books")
    Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
}
