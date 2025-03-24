package com.lecturaBD.controller;

import com.lecturaBD.entity.ReadingPlan;
import com.lecturaBD.service.ReadingPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/reading-plans")
public class ReadingPlanController {

    @Autowired
    private ReadingPlanService readingPlanService;

    @GetMapping("/user/{userId}")
    public List<ReadingPlan> getPlansByUser(@PathVariable UUID userId){
        return readingPlanService.getPlansByUser(userId);
    }
    @GetMapping("/{id}")
    public Optional<ReadingPlan> getPlanById(@PathVariable UUID id) {
        return readingPlanService.getPlansById(id);
    }

    @PostMapping
    public ReadingPlan createPlan(@RequestBody ReadingPlan readingPlan) {
        return readingPlanService.savePlan(readingPlan);
    }

    @DeleteMapping("/{id}")
    public void deletePlan(@PathVariable UUID id) {
        readingPlanService.deletePlan(id);
    }
}
