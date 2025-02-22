package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.BankAccount;
import com.automation.attendanceautomationmanagementsystem.service.impl.BankAccountServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank_account")
public class BankAccountController extends AbstractBaseController<BankAccount, BankAccountServiceImpl>{
    public BankAccountController(BankAccountServiceImpl service) {
        super(service);
    }
}
