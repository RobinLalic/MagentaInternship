package com.magentafinal.magentalogininternshipfinal.service;

import com.magentafinal.magentalogininternshipfinal.model.Book;
import com.magentafinal.magentalogininternshipfinal.model.User;
import com.magentafinal.magentalogininternshipfinal.repository.BookRepository;
import com.magentafinal.magentalogininternshipfinal.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BookRepository bookRepository;

    public List<User> getUsers() { return userRepository.findAll(); }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User addReadingPreference(Long userId, Long bookId){
        User user = userRepository.findById(userId).get();
        Book book = bookRepository.findById(bookId).get();
        user.addReadingPreference(book);
        return userRepository.save(user);
    }


    public User removeReadingPreference(Long userId, Long bookId) {
        User user = userRepository.findById(userId).get();
        Book book = bookRepository.findById(bookId).get();
        user.deleteReadingPreference(book);
        return userRepository.save(user);

    }
}
