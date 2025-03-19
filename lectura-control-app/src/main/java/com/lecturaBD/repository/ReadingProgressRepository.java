package com.lecturaBD.repository;

import com.lecturaBD.entity.ReadingProgress;
import com.lecturaBD.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ReadingProgressRepository extends JpaRepository<ReadingProgress, UUID> {
    Optional<ReadingProgress> findByUserAndReadingDayId(UUID userId, UUID readingDayId);
}
