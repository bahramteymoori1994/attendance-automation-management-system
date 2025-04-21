package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.exception.ServiceException;
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

    @Override
    public Person findById(Long id) throws ServiceException {
        return personRepository.findById(id).orElseThrow(() -> new ServiceException("Person not found"));
    }

    public List<Person> findByName(String name) throws ServiceException
    {
        if( personRepository.findByName(name).equals(name) )
        {
            return personRepository.findByName(name);
        }
        else
        {
            throw new ServiceException("Person name not found...!");
        }
    }
    public List<Person> findByFamily(String family) throws ServiceException
    {
        if( personRepository.findByFamily(family).equals(family) )
        {
            return personRepository.findByFamily(family);
        }
        else
        {
            throw new ServiceException("Person family not found...!");
        }
    }
    public Person findByNationalCode(String nationalCode) throws ServiceException
    {
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
