package com.automation.attendanceautomationmanagementsystem.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EntityListeners(AuditingEntityListener.class)
@Entity(name="bankAccountEntity")
@Table(name="bank_account_tbl")
public class BankAccount {
    @Id
    @SequenceGenerator(name = "bankAccountSeq", sequenceName = "bank_account_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bankAccountSeq")
    @Column(name = "bank_account_id")
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "sheba_code", nullable = false, length = 26)
    private String shebaCode;

    @Column(name = "card_number", nullable = false, length = 16)
    private String cardNumber;

    @Column(name = "CCV2", nullable = false, length = 4)
    private String ccv2;

    @Column(name = "expired_date", nullable = false)
    private LocalDateTime expiredDate;

    @ManyToOne
    @JoinColumn(name = "PERSON_ID", referencedColumnName = "person_id")
    private Person person;
}
