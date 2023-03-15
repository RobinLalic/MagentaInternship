package com.magentafinal.magentalogininternshipfinal.service;

import com.magentafinal.magentalogininternshipfinal.model.Book;
import com.magentafinal.magentalogininternshipfinal.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getBooks() { return bookRepository.findAll(); }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
}
