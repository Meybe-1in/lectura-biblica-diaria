package com.lecturaBD.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String firebaseUid; // Firebase UID

    @Column(nullable = false)
    private String authProvider; // "GOOGLE", "FACEBOOK", "EMAIL_PASSWORD"

    @Column(nullable = false, updatable = false)
    private LocalDateTime created = LocalDateTime.now();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReadingPlan> readingPlans;
}
