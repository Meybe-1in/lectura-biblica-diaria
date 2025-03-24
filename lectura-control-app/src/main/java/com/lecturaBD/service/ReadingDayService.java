package com.lecturaBD.service;

import com.lecturaBD.entity.ReadingDay;
import com.lecturaBD.repository.ReadingDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ReadingDayService {
    @Autowired
    private ReadingDayRepository readingDayRepository;

    @GetMapping("/plan/{planId}")
    public List<ReadingDay> getReadingDaysByPlan(@PathVariable UUID planId) {
        return readingDayRepository.findByReadingPlanId(planId);
    }

    public Optional<ReadingDay> getDayById(UUID id){
        return readingDayRepository.findById(id);
    }
    public ReadingDay saveDay(ReadingDay readingDay){
        return readingDayRepository.save(readingDay);
    }

    public void deleteDay(UUID id){
        readingDayRepository.deleteById(id);
    }
}
