package com.automation.attendanceautomationmanagementsystem.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EntityListeners(AuditingEntityListener.class)
@SequenceGenerator(name = "personSeq", sequenceName = "person_seq", initialValue = 1, allocationSize = 10)
@Entity(name="personEntity")
@Table(name="person_tbl")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "personSeq")
    @Column(name = "person_id")
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "family", nullable = false, length = 50)
    private String family;

    @Column(name = "national_code", nullable = false, unique = true, length = 10)
    private String nationalCode;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthdate;

    @Column(name = "phone", nullable = false, unique = true, length = 15)
    private String phone;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "address", nullable = false, length = 2000)
    private String address;

    @Column(name = "post_code", nullable = false, length = 4)
    private String postCode;
}