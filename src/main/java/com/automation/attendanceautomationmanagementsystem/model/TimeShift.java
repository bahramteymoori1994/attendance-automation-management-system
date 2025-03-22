package com.automation.attendanceautomationmanagementsystem.model;

import com.automation.attendanceautomationmanagementsystem.model.enums.DayWeek;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "timeShiftEntity")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EntityListeners(AuditingEntityListener.class)
@Table(name = "time_shift")
@SequenceGenerator(name = "TIME_SHIFT_GENERATOR", sequenceName = "TIME_SHIFT_SEQ"
        , initialValue = 1, allocationSize = 10)
public class TimeShift
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "TIME_SHIFT_GENERATOR")
    @Column(name = "TIME_SHIFT_ID")
    private Long id;

    @Column(name = "SHIFT_DATE", nullable = false)
    private LocalDate shiftDate;

    @Column(name = "DAY_WEEK", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private DayWeek dayWeek;

    @Column(name = "SHIFT_START", nullable = false)
    private LocalTime shiftStart;

    @Column(name = "SHIFT_END", nullable = false)
    private LocalTime shiftEnd;

    @Column(name = "DESCRIPTION", length = 2000)
    private String description;

    @ManyToOne
    @JoinColumn(name = "WORK_SHIFT_ID", referencedColumnName = "WORK_SHIFT_ID")
    private WorkShift workShift;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(name = "USER_TIME_SHIFT", joinColumns = @JoinColumn(name = "USER_ID"),
    inverseJoinColumns = @JoinColumn(name = "TIME_SHIFT_ID"), foreignKey = @ForeignKey(name = "FK_USER_TIME_SHIFT"),
    inverseForeignKey = @ForeignKey(name = "FK_INVERSE_USER_TIME_SHIFT"))
    private List<User> users = new ArrayList<>();
}