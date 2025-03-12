package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.BankAccount;
import com.automation.attendanceautomationmanagementsystem.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
    List<BankAccount> findByName(String name);
    BankAccount findByShebaCode(String shebaCode);
    BankAccount findByCardNumber(String cardNumber);
    BankAccount findByCardNumberContains(String cardNumber);
    boolean existsByCardNumber(String cardNumber);
    List<BankAccount> findByCCV2(String ccv2);
    boolean existsByCCV2(String ccv2);
    List<BankAccount> findByExpiredDate(LocalDateTime expiredDate);
    BankAccount findBankAccountsByPerson(Person person);
}
