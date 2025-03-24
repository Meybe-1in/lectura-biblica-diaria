package com.lecturaBD.controller;

import com.lecturaBD.entity.ReadingProgress;
import com.lecturaBD.service.ReadingProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/reading-progress")
public class ReadingProgressController {

    @Autowired
    private ReadingProgressService readingProgressService;

    @GetMapping("/{userId}/{readingDayId}")
    public Optional<ReadingProgress> getProgress(@PathVariable UUID userId, @PathVariable UUID readingDayId) {
        return readingProgressService.getProgress(userId, readingDayId);
    }

    @PostMapping
    public ReadingProgress saveProgress(@RequestBody ReadingProgress readingProgress) {
        return readingProgressService.saveProgress(readingProgress);
    }
}
