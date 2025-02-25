package com.automation.attendanceautomationmanagementsystem.model;

import com.automation.attendanceautomationmanagementsystem.model.enums.DayWeek;
import com.automation.attendanceautomationmanagementsystem.model.enums.ExtraShiftType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity(name = "extraShiftTimeEntity")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "extra_shift_time")
@SequenceGenerator(name = "EXTRA_SHIFT_TIME_GENERATOR", sequenceName = "EXTRA_SHIFT_TIME_SEQ",
allocationSize = 1, initialValue = 10)
public class ExtraShiftTime
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "EXTRA_SHIFT_TIME_GENERATOR")
    @Column(name = "EXTRA_SHIFT_TIME_ID")
    private Long id;

    @Column(name = "EXTRA_SHIFT_DATE", nullable = false)
    private LocalDate extraShiftDate;

    @Column(name = "WEEK_DAY", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private DayWeek dayWeek;

    @Column(name = "EXTRA_SHIFT_TYPE", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private ExtraShiftType extraShiftType;

    @Column(name = "EXTRA_SHIFT_START", nullable = false)
    private LocalTime extraShiftStart;

    @Column(name = "EXTRA_SHIFT_END", nullable = false)
    private LocalTime extraShiftEnd;

    @Column(name = "EXTRA_SHIFT_TASK", nullable = false, length = 50)
    private String extraShiftTask;

    @Column(name = "DESCRIPTION", length = 2000)
    private String description;

    @ManyToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
    private User user;
}