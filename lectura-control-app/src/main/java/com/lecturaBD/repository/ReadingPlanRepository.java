package com.lecturaBD.repository;

import com.lecturaBD.entity.ReadingPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ReadingPlanRepository extends JpaRepository<ReadingPlan, UUID> {
    List<ReadingPlan> findByUserId(UUID userId);
}
