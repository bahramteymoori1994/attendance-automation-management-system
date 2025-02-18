package com.automation.attendanceautomationmanagementsystem.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EntityListeners(AuditingEntityListener.class)

@Entity(name="drivingLicenseEntity")
@Table(name="driving_license_tbl")
public class DrivingLicense {
    @Id
    @SequenceGenerator(name = "drivingLicenseSeq", sequenceName = "driving_license_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "drivingLicenseSeq")
    @Column(name = "driving_license_id")
    private Long id;

    @Column(name = "serial_number", nullable = false, length = 10)
    private String serialNumber;

    @Column(name = "validity_period", nullable = false)
    private LocalDateTime validityPeriod;

    @Column(name = "creation_date", nullable = false)
    private LocalDateTime creationDate;

    @Column(name = "level")
    private boolean level;
}
