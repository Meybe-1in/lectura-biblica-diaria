package com.lecturaBD.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
import java.time.LocalDateTime;

@Entity
@Table(name = "reading_progress")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReadingProgress {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ReadingStatus status;

    @Column(nullable = true)
    private LocalDateTime dateCompleted; // Nullable if not read yet

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToOne
    @JoinColumn(name = "reading_day_id", nullable = false)
    private ReadingDay readingDay;

    public enum ReadingStatus {
        READ, PENDING
    }
}
