package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.Person;
import com.automation.attendanceautomationmanagementsystem.service.impl.PersonServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController extends AbstractBaseController<Person, PersonServiceImpl>{
    public PersonController(PersonServiceImpl service) {
        super(service);
    }
}
