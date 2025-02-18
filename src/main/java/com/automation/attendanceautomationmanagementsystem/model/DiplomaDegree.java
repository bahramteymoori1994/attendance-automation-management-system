package com.automation.attendanceautomationmanagementsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity(name = "diplomaDegreeEntity")
@Table(name = "diploma_degree")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class DiplomaDegree extends Degree
{
    @Column(name = "SCHOOL_NAME", nullable = false, length = 50)
    private String schoolName;
}