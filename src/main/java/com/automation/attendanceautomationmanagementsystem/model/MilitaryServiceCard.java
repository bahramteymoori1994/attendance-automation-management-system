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

@Entity(name="militaryServiceCardEntity")
@Table(name="military_service_card_tbl")
public class MilitaryServiceCard {
    @Id
    @SequenceGenerator(name = "militaryServiceCardSeq", sequenceName = "military_service_card_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "militaryServiceCardSeq")
    @Column(name = "military_service_card_id")
    private Long id;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    @Column(name = "creation_date", nullable = false)
    @Temporal(value = TemporalType.DATE)
    private LocalDate creationDate;

    @OneToOne
    @JoinColumn(name = "PERSON_ID", referencedColumnName = "person_id")
    private Person person;
}
