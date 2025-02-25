package com.automation.attendanceautomationmanagementsystem.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "drivingLicenseEntity")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Table(name = "driving_license")
@SequenceGenerator(name = "DRIVING_LICENSE_GENERATOR", sequenceName = "DRIVING_LICENSE_SEQ",
allocationSize = 10, initialValue = 1)
public class DrivingLicense
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "DRIVING_LICENSE_GENERATOR")
    @Column(name = "DRIVING_LICENSE_ID")
    private Long id;

    @Column(name = "serial_number", nullable = false, length = 10)
    private String serialNumber;

    @Column(name = "validity_period", nullable = false)
    private LocalDate validityPeriod;

    @Column(name = "creation_date", nullable = false)
    private LocalDateTime creationDate;

    @Column(name = "level_license")
    private Boolean levelLicense;

    @OneToOne
    @JoinColumn(
            name = "person",
            foreignKey = @ForeignKey(name = "fk_driving_license_person")
    )
    private Person person;
}