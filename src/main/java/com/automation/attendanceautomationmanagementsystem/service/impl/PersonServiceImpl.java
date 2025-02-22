package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Person;
import com.automation.attendanceautomationmanagementsystem.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends AbstractBaseServiceImpl<Person, PersonRepository>{
    public PersonServiceImpl(PersonRepository repository) {
        super(repository);
    }
}
