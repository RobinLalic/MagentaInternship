package com.magentafinal.magentalogininternshipfinal.controller;


import com.magentafinal.magentalogininternshipfinal.service.ReadingStatisticsService;
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
    private final ReadingStatisticsService readingStatisticsService;

    @GetMapping("/statistics/avgage/{genre}")
    public Double getAverageUserAgeForGenre(@PathVariable String genre) {
        return readingStatisticsService.getAverageUserAgeForGenre(genre);
    }

    @GetMapping("/statistics/readingpercentage")
    public List<Object[]> getAuthorPercentage(){
        return readingStatisticsService.getAuthorPercentage();
    }
}

