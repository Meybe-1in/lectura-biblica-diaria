package com.lecturaBD.service;

import com.lecturaBD.entity.ReadingProgress;
import com.lecturaBD.repository.ReadingProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ReadingProgressService {
    @Autowired
    private ReadingProgressRepository readingProgressRepository;

    public Optional<ReadingProgress> getProgress (UUID userId, UUID readingDayId){
        return readingProgressRepository.findByUserAndReadingDayId(userId, readingDayId);
    }

    public ReadingProgress saveProgress(ReadingProgress progress){
        return readingProgressRepository.save(progress);
    }
}
