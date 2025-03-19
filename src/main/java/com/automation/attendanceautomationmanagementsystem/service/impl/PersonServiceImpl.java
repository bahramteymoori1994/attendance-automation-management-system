package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Person;
import com.automation.attendanceautomationmanagementsystem.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PersonServiceImpl extends AbstractBaseServiceImpl<Person, PersonRepository>{
    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository repository, PersonRepository personRepository) {
        super(repository);
        this.personRepository = personRepository;
    }

    public List<Person> findByName(String Name){
        return personRepository.findByName(Name);
    }
    public List<Person> findByFamily(String family){
        return personRepository.findByFamily(family);
    }
    public Person findByNationalCode(String nationalCode){
        return personRepository.findByNationalCode(nationalCode);
    }
    public List<Person> findByBirthdate(LocalDate birthdate){
        return personRepository.findByBirthdate(birthdate);
    }
    public Person findByPhone(String phone){
        return personRepository.findByPhone(phone);
    }
    public Person findByEmail(String email){
        return personRepository.findByEmail(email);
    }
    public List<Person> findByAddress(String address){
        return personRepository.findByAddress(address);
    }
    public List<Person> findByPostCode(String postCode){
        return personRepository.findByPostCode(postCode);
    }
}
