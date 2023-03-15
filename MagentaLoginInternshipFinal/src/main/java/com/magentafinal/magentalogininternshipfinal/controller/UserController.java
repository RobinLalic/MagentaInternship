package com.magentafinal.magentalogininternshipfinal.controller;

import com.magentafinal.magentalogininternshipfinal.model.Book;
import com.magentafinal.magentalogininternshipfinal.model.User;
import com.magentafinal.magentalogininternshipfinal.repository.BookRepository;
import com.magentafinal.magentalogininternshipfinal.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {
    private final UserRepository userRepository;
    private final BookRepository bookRepository;

    @GetMapping("/users")
    List<User> getUsers() { return userRepository.findAll(); }

    @PostMapping("/users")
    User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/{userId}/users/{bookId}")
    User addReadingPreference(@PathVariable Long userId, @PathVariable Long bookId){
        User user = userRepository.findById(userId).get();
        Book book = bookRepository.findById(bookId).get();
        user.addReadingPreference(book);
        return userRepository.save(user);
    }

    @DeleteMapping("/{userId}/users/{bookId}")
    User removeReadingPreference(@PathVariable Long userId, @PathVariable Long bookId) {
        User user = userRepository.findById(userId).get();
        Book book = bookRepository.findById(bookId).get();
        user.deleteReadingPreference(book);
        return userRepository.save(user);

    }





}
