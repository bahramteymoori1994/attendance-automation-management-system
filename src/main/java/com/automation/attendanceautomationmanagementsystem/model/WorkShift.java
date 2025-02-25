package com.automation.attendanceautomationmanagementsystem.model;

import com.automation.attendanceautomationmanagementsystem.model.enums.WorkShiftType;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;

@Entity(name = "workShiftEntity")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "work_shift")
@EntityListeners(AuditingEntityListener.class)
@SequenceGenerator(name = "WORK_SHIFT_GENERATOR", sequenceName = "WORK_SHIFT_SEQ"
        , initialValue = 1, allocationSize = 10)
public class WorkShift
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "WORK_SHIFT_GENERATOR")
    @Column(name = "WORK_SHIFT_ID")
    private Long id;

    @Column(name = "WORK_SHIFT_CODE", nullable = false, length = 4, unique = true)
    private String workShiftCode;

    @Column(name = "WORK_SHIFT_NAME", length = 50, nullable = false)
    private String name;

    @Column(name = "WORK_SHIFT_TYPE", nullable = false)
    @Enumerated(value = EnumType.ORDINAL)
    private WorkShiftType workShiftType;

    @Column(name = "DESCRIPTION", length = 2000)
    private String description;

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID", referencedColumnName = "department_id")
    private Department department;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(name = "USER_WORK_SHIFT", joinColumns = @JoinColumn(name = "USER_ID"),
    inverseJoinColumns = @JoinColumn(name = "WORK_SHIFT_ID"), foreignKey = @ForeignKey(name = "FK_USER_WORK_SHIFT"),
    inverseForeignKey = @ForeignKey(name = "FK_INVERSE_USER_WORK_SHIFT"))
    private List<User> users;

    @ManyToOne
    @JoinColumn(name = "ORGANIZATION_ID", referencedColumnName = "organization_id")
    private Organization organization;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(name = "SECTION_WORK_SHIFT", joinColumns = @JoinColumn(name = "SECTION_ID"),
    inverseJoinColumns = @JoinColumn(name = "WORK_SHIFT_ID"), foreignKey = @ForeignKey(name = "FK_SECTION_WORK_SHIFT"),
    inverseForeignKey = @ForeignKey(name = "FK_INVERSE_SECTION_WORK_SHIFT"))
    private List<Section> sections;
}