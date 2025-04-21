package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.exception.ServiceException;
import com.automation.attendanceautomationmanagementsystem.model.Person;
import com.automation.attendanceautomationmanagementsystem.service.impl.PersonServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController extends AbstractBaseController<Person, PersonServiceImpl>
{
    private final PersonServiceImpl personServiceImpl;

    public PersonController(PersonServiceImpl service, PersonServiceImpl personServiceImpl) {
        super(service);
        this.personServiceImpl = personServiceImpl;
    }

    @GetMapping("/findByName/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<Person> findByName(@PathVariable String name) throws ServiceException
    {
        return personServiceImpl.findByName(name);
    }

    @GetMapping("/findByFamily/{family}")
    @ResponseStatus(HttpStatus.OK)
    public List<Person> findByFamily(@PathVariable String family) throws ServiceException
    {
        return personServiceImpl.findByFamily(family);
    }

    @GetMapping("/findByNationalCode/{nationalCode}")
    @ResponseStatus(HttpStatus.OK)
    public Person findByNationalCode(@PathVariable String nationalCode) throws ServiceException
    {
        return personServiceImpl.findByNationalCode(nationalCode);
    }
}