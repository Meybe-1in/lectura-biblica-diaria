package com.lecturaBD.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
import java.time.LocalDate;

@Entity
@Table(name = "reading_days")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReadingDay {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private String book; // e.g. "Numbers"

    @Column(nullable = false)
    private int chapter; // e.g. 3

    @ManyToOne
    @JoinColumn(name = "reading_plan_id", nullable = false)
    private ReadingPlan readingPlan;

    @OneToOne(mappedBy = "readingDay", cascade = CascadeType.ALL, orphanRemoval = true)
    private ReadingProgress readingProgress;
}
