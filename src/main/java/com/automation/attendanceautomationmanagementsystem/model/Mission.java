package com.automation.attendanceautomationmanagementsystem.model;

import com.automation.attendanceautomationmanagementsystem.model.enums.MissionType;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Entity(name = "missionEntity")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EntityListeners(AuditingEntityListener.class)
@Table(name = "mission")
@SequenceGenerator(name = "MISSION_SEQ_GENERATOR", sequenceName = "MISSION_SEQ", initialValue = 1, allocationSize = 10)
public class Mission
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "MISSION_SEQ_GENERATOR")
    @Column(name = "MISSION_ID")
    private Long id;

    @Column(name = "MISSION_TYPE", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private MissionType missionType;

    @Column(name = "MISSION_TITLE", nullable = false, length = 50)
    private String missionTitle;

    @Column(name = "START_DATE", nullable = false)
    private LocalDate startDate;

    @Column(name = "END_DATE", nullable = false)
    private LocalDate endDate;

    @Column(name = "TOTAL_DAYS", nullable = false)
    private Integer totalDays;

    @Column(name = "TOTAL_HOURS", nullable = false)
    private Integer totalHours;

    @Column(name = "MISSION_PLACE", nullable = false, length = 50)
    private String missionPlace;

    @Column(name = "MISSION_TASK", nullable = false, length = 50)
    private String missionTask;

    @Column(name = "DESCRIPTION", length = 2000)
    private String description;
}