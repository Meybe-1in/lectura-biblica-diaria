package com.lecturaBD.service;

import com.lecturaBD.entity.ReadingPlan;
import com.lecturaBD.repository.ReadingPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ReadingPlanService {

    @Autowired
    private ReadingPlanRepository readingPlanRepository;

    public List<ReadingPlan> getPlansByUser(UUID userId){
        return readingPlanRepository.findByUserId(userId);
    }

    public Optional<ReadingPlan> getPlansById(UUID id){
        return readingPlanRepository.findById(id);
    }
    public ReadingPlan savePlan(ReadingPlan readingPlan){
        return readingPlanRepository.save(readingPlan);
    }
    public void deletePlan(UUID id){
        readingPlanRepository.deleteById(id);
    }
}
