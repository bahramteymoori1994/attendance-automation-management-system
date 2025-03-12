package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.BankAccount;
import com.automation.attendanceautomationmanagementsystem.model.Person;
import com.automation.attendanceautomationmanagementsystem.repository.BankAccountRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BankAccountServiceImpl extends AbstractBaseServiceImpl<BankAccount, BankAccountRepository>{
    private final BankAccountRepository bankAccountRepository;

    public BankAccountServiceImpl(BankAccountRepository repository, BankAccountRepository bankAccountRepository) {
        super(repository);
        this.bankAccountRepository = bankAccountRepository;
    }

    public List<BankAccount> findByName(String name){
        return bankAccountRepository.findByName(name);
    }

    public BankAccount findByShebaCode(String shebaCode){
        return bankAccountRepository.findByShebaCode(shebaCode);
    }

    public BankAccount findByCardNumber(String cardNumber){
        return bankAccountRepository.findByCardNumber(cardNumber);
    }
    public BankAccount findByCardNumberContains(String cardNumber){
        return bankAccountRepository.findByCardNumberContains(cardNumber);
    }
    public boolean existsByCardNumber(String cardNumber){
        return bankAccountRepository.existsByCardNumber(cardNumber);
    }
    public List<BankAccount> findByCCV2(String ccv2){
        return bankAccountRepository.findByCCV2(ccv2);
    }
    public boolean existsByCCV2(String ccv2){
        return bankAccountRepository.existsByCCV2(ccv2);
    }
    public List<BankAccount> findByExpiredDate(LocalDateTime expiredDate){
        return bankAccountRepository.findByExpiredDate(expiredDate);
    }
    public BankAccount findBankAccountsByPerson(Person person){
        return bankAccountRepository.findBankAccountsByPerson(person);
    }
}
