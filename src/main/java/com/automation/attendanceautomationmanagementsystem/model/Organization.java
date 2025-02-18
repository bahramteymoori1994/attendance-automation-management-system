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

@Entity(name="organizationEntity")
@Table(name="organization_tbl")
public class Organization {
    @Id
    @SequenceGenerator(name = "organizationSeq", sequenceName = "organization_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organizationSeq")
    @Column(name = "organization_id")
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
