package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.BankAccount;
import com.automation.attendanceautomationmanagementsystem.repository.BankAccountRepository;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl extends AbstractBaseServiceImpl<BankAccount, BankAccountRepository>{
    public BankAccountServiceImpl(BankAccountRepository repository) {
        super(repository);
    }
}
