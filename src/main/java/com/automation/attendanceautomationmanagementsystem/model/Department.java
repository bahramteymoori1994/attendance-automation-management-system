package com.automation.attendanceautomationmanagementsystem.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EntityListeners(AuditingEntityListener.class)

@Entity(name="departmentEntity")
@Table(name="department_tbl")
public class Department {
    @Id
    @SequenceGenerator(name = "departmentSeq", sequenceName = "department_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "departmentSeq")
    @Column(name = "department_id")
    private Long id;

    @Column(name = "address", nullable = false, length = 2000)
    private String address;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "phone_number", nullable = false, unique = true, length = 15)
    private String phoneNumber;

    @Column(name = "description", length = 2000)
    private String description;

    @Column(name = "task", length = 50)
    private String task;

}
