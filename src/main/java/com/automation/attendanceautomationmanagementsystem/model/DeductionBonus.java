package com.automation.attendanceautomationmanagementsystem.model;

import com.automation.attendanceautomationmanagementsystem.model.enums.DeductionType;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "deductionBonusEntity")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "deduction_bonus")
@SequenceGenerator(name = "DEDUCTION_BONUS_GENERATOR", sequenceName = "DEDUCTION_BONUS_SEQ",
initialValue = 1, allocationSize = 10)
public class DeductionBonus
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "DEDUCTION_BONUS_GENERATOR")
    @Column(name = "DEDUCTION_BONUS_ID")
    private Long id;

    @Column(name = "DEDUCTION_BONUS_TYPE", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private DeductionType deductionType;

    @Column(name = "DEDUCTION_BONUS_AMOUNT", nullable = false)
    private Double deductionBonusAmount;

    @Column(name = "DEDUCTION_BONUS_REASON", nullable = false, length = 50)
    private String deductionBonusReason;

    @Column(name = "DESCRIPTION", length = 2000)
    private String description;

    @ManyToOne
    @JoinColumn(name = "TIME_SHEET_ID", referencedColumnName = "TIME_SHEET_ID")
    private TimeSheet timeSheet;
}