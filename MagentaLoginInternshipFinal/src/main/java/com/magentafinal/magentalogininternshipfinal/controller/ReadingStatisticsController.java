package com.magentafinal.magentalogininternshipfinal.controller;


import com.magentafinal.magentalogininternshipfinal.repository.BookRepository;
import com.magentafinal.magentalogininternshipfinal.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ReadingStatisticsController {
    private final UserRepository userRepository;
    private final BookRepository bookRepository;

    @GetMapping("/statistics/{genre}")
    public Double getAverageUserAgeForGenre(@PathVariable String genre) {
        return userRepository.findAverageAgeByBookGenre(genre);
    }

    @GetMapping("/statistics/readingpercentage")
    public List<Object[]> getAuthorPercentage(){
        return userRepository.getReadingPreferencesByAuthor();
    }
}

