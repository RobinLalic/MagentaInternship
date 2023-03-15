package com.magentafinal.magentalogininternshipfinal.controller;

import com.magentafinal.magentalogininternshipfinal.model.Book;
import com.magentafinal.magentalogininternshipfinal.model.User;
import com.magentafinal.magentalogininternshipfinal.repository.BookRepository;
import com.magentafinal.magentalogininternshipfinal.repository.UserRepository;
import com.magentafinal.magentalogininternshipfinal.service.BookService;
import com.magentafinal.magentalogininternshipfinal.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    List<User> getUsers() { return userService.getUsers(); }

    @PostMapping("/users")
    User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/{userId}/users/{bookId}")
    User addReadingPreference(@PathVariable Long userId, @PathVariable Long bookId){
       return userService.addReadingPreference(userId, bookId);
    }

    @DeleteMapping("/{userId}/users/{bookId}")
    User removeReadingPreference(@PathVariable Long userId, @PathVariable Long bookId) {
       return userService.removeReadingPreference(userId, bookId);
    }
}
