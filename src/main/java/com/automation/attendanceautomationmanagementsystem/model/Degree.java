package com.automation.attendanceautomationmanagementsystem.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@MappedSuperclass
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SequenceGenerator(name = "DEGREE_GENERATOR", sequenceName = "DEGREE_SEQ",
initialValue = 1, allocationSize = 10)
public abstract class Degree
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "DEGREE_GENERATOR")
    @Column(name = "DEGREE_ID")
    private Long id;

    @Column(name = "DEGREE_CODE", nullable = false, length = 10, unique = true)
    private String degreeCode;

    @Column(name = "UNIVERSITY_NAME", length = 50)
    private String universityName;

    @Column(name = "MAJOR", nullable = false, length = 50)
    private String major;

    @Column(name = "STUDENT_NUMBER", nullable = false, length = 10, unique = true)
    private String studentNumber;

    @Column(name = "CITY_STUDY", nullable = false, length = 50)
    private String cityStudy;

    @Column(name = "OVERALL_GRADE", nullable = false, length = 4)
    private Double overallGrade;

    @Column(name = "YEAR_ENTERING", nullable = false, length = 4)
    private Integer yearEntering;

    @Column(name = "GRADUATION_DATE", nullable = false)
    private LocalDate graduationDate;

    @ManyToOne
    @JoinColumn(name = "PERSON_ID", referencedColumnName = "person_id")
    private Person person;
}