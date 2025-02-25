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

@Entity(name="medicalHistoryEntity")
@Table(name="medical_history_tbl")
public class MedicalHistory {
    @Id
    @SequenceGenerator(name = "medicalHistorySeq", sequenceName = "medical_history_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medicalHistorySeq")
    @Column(name = "medical_history_id")
    private Long id;

    @Column(name = "illness", nullable = false, length = 50)
    private String illness;

    @Column(name = "previous_illness", length = 50)
    private String previousIllness;

    @ManyToOne
    @JoinColumn(name = "PERSON_ID", referencedColumnName = "id")
    private Person person;
}
