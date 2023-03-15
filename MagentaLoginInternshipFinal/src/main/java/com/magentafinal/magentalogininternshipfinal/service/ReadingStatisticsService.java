package com.magentafinal.magentalogininternshipfinal.service;

import com.magentafinal.magentalogininternshipfinal.repository.BookRepository;
import com.magentafinal.magentalogininternshipfinal.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReadingStatisticsService {
    UserRepository userRepository;
    BookRepository bookRepository;


}
