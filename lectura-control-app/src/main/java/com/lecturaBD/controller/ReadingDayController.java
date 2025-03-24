package com.lecturaBD.controller;

import com.lecturaBD.entity.ReadingDay;
import com.lecturaBD.service.ReadingDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/reading-days")
public class ReadingDayController {

    @Autowired
    private ReadingDayService readingDayService;

    @GetMapping("/plan/{planId}")
    public List<ReadingDay> getDaysByPlan(@PathVariable UUID planId) {
        return readingDayService.getReadingDaysByPlan(planId);
    }

    @GetMapping("/{id}")
    public Optional<ReadingDay> getDayById(@PathVariable UUID id) {
        return readingDayService.getDayById(id);
    }

    @PostMapping
    public ReadingDay createDay(@RequestBody ReadingDay readingDay) {
        return readingDayService.saveDay(readingDay);
    }

    @DeleteMapping("/{id}")
    public void deleteDay(@PathVariable UUID id) {
        readingDayService.deleteDay(id);
    }
}
