package com.automation.attendanceautomationmanagementsystem.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EntityListeners(AuditingEntityListener.class)

@Entity(name="workHistoryEntity")
@Table(name="work_history_tbl")
public class WorkHistory {
    @Id
    @SequenceGenerator(name = "workHistorySeq", sequenceName = "work_history_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workHistorySeq")
    @Column(name = "work_history_id")
    private Long id;

    @Column(name = "job_title", nullable = false, length = 50)
    private String jobTitle;

    @Column(name = "organization_name", nullable = false, length = 50)
    private String organizationName;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    @Column(name = "responsibility", nullable = false, length = 2000)
    private String responsibility;

    @Column(name = "job_promotion", length = 50)
    private String jobPromotion;

    @Column(name = "collaboration_type", nullable = false)
    private boolean collaborationType;
}
