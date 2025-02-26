package com.automation.attendanceautomationmanagementsystem.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EntityListeners(AuditingEntityListener.class)

@Entity(name="userEntity")
@Table(name="user_tbl")
@SequenceGenerator(name = "USER_GENERATOR", sequenceName = "USER_SEQ", initialValue = 1, allocationSize = 10)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "USER_GENERATOR")
    @Column(name = "USER_ID")
    private Long id;

    @Column(name = "user_name", unique = true, nullable = false, length = 50)
    private String username;

    @Column(name = "password", nullable = false, length = 50)
    private String password;

    @Column(name = "status", nullable = false)
    private boolean status;

    @Column(name = "last_login", nullable = false)
    private LocalDateTime lastLogin;

    @ManyToOne
    @JoinColumn(name = "ORGANIZATION_ID", referencedColumnName = "organization_id")
    private Organization organization;

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID", referencedColumnName = "department_id")
    private Department department;

    @OneToOne
    @JoinColumn(name = "PERSON_ID", referencedColumnName = "person_id")
    private Person person;
}
