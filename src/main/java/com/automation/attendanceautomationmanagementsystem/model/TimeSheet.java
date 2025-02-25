package com.automation.attendanceautomationmanagementsystem.model;

import com.automation.attendanceautomationmanagementsystem.model.enums.DayWeek;
import com.automation.attendanceautomationmanagementsystem.model.enums.UserStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity(name = "timeSheetEntity")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "time_sheet")
@SequenceGenerator(name = "TIME_SHEET_GENERATOR", sequenceName = "TIME_SHEET_SEQ",
        initialValue = 1, allocationSize = 10)
public class TimeSheet
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "TIME_SHEET_GENERATOR")
    @Column(name = "TIME_SHEET_ID")
    private Long id;

    @Column(name = "TIME_SHEET_TITLE", nullable = false, length = 50)
    private String timeSheetTitle;

    @Column(name = "WEEK_DAY", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private DayWeek dayWeek;

    @Column(name = "TIME_SHEET_DATE", nullable = false)
    private LocalDate timeSheetDate;

    @Column(name = "USER_STATUS", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UserStatus userStatus;

    @Column(name = "ENTRY_TIME", nullable = false)
    private LocalTime entryTime;

    @Column(name = "DELAY_ENTRY_TIME")
    private LocalTime delayEntryTime;

    @Column(name = "START_TIME", nullable = false)
    private LocalTime startTime;

    @Column(name = "TOTAL_WORKING_HOURS", nullable = false)
    private Integer totalWorkingHours;

    @Column(name = "EXIT_TIME", nullable = false)
    private LocalTime exitTime;

    @Column(name = "CONSTANT_MONTHLY_HOURS", nullable = false)
    private Integer constantMonthlyHours = 160;

    @Column(name = "DESCRIPTION", length = 2000)
    private String description;

    @ManyToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
    private User user;
}