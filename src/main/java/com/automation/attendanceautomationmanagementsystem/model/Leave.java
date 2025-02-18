package com.automation.attendanceautomationmanagementsystem.model;

import com.automation.attendanceautomationmanagementsystem.model.enums.LeaveType;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Entity(name = "leaveEntity")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EntityListeners(AuditingEntityListener.class)
@Table(name = "leave")
@SequenceGenerator(name = "LEAVE_SEQ_GENERATOR", sequenceName = "LEAVE_SEQ", initialValue = 1, allocationSize = 10)
public class Leave
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "LEAVE_SEQ_GENERATOR")
    private Long id;

    @Column(name = "YEAR", nullable = false, length = 4)
    private Integer year;

    @Column(name = "LEAVE_TYPE", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private LeaveType leaveType;

    @Column(name = "START_DATE", nullable = false)
    private LocalDate startDate;

    @Column(name = "END_DATE", nullable = false)
    private LocalDate endDate;

    @Column(name = "TOTAL_DAYS", nullable = false, length = 4)
    private Integer totalDays;

    @Column(name = "TOTAL_HOURS", nullable = false, length = 4)
    private Integer totalHours;

    @Column(name = "TOTAL_DAYS_IN_YEAR", nullable = false, length = 4)
    private Integer totalLeaveDaysInYear = 38;

    @Column(name = "REMAINING_DAYS", nullable = false, length = 4)
    private Integer remainingDays;

    @Column(name = "DESTINATION", nullable = false, length = 50)
    private String destination;

    @Column(name = "DESCRIPTION", length = 2000)
    private String description;
}