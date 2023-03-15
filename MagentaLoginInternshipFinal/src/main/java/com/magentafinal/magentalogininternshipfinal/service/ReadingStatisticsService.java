package com.magentafinal.magentalogininternshipfinal.service;

import com.magentafinal.magentalogininternshipfinal.repository.BookRepository;
import com.magentafinal.magentalogininternshipfinal.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReadingStatisticsService {
    private final UserRepository userRepository;

    public Double getAverageUserAgeForGenre(String genre) {
        return userRepository.findAverageAgeByBookGenre(genre);
    }

    public List<Object[]> getAuthorPercentage(){
        return userRepository.getReadingPreferencesByAuthor();
    }



}
