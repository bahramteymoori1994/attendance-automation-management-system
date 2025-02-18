package com.automation.attendanceautomationmanagementsystem.model.enums;

import com.automation.attendanceautomationmanagementsystem.model.Degree;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity(name = "diplomaDegreeEntity")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "diploma_degree")
public class DiplomaDegree extends Degree
{
    @Column(name = "SCHOOL_NAME", nullable = false, length = 50)
    private String schoolName;
}