package com.lecturaBD.repository;

import com.lecturaBD.entity.ReadingDay;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ReadingDayRepository extends JpaRepository<ReadingDay, UUID> {
    List<ReadingDay> findByReadingPlanId(UUID readingPlanId);
}
