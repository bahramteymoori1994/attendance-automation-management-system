package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.exception.ServiceException;
import com.automation.attendanceautomationmanagementsystem.service.impl.AbstractBaseServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class AbstractBaseController<E, S extends AbstractBaseServiceImpl<E, ?>>
{
    private final S service;

    public AbstractBaseController(S service) {
        this.service = service;
    }

    @PostMapping()
    @ResponseStatus(value = HttpStatus.CREATED)
    public E save(@RequestBody E entity)
    {
        return service.save(entity);
    }

    @PutMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public E update(@RequestBody E entity)
    {
        return service.save(entity);
    }

    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id)
    {
        service.deleteById(id);
    }

    @GetMapping("/findById/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public E findById(@PathVariable Long id) throws ServiceException
    {
        return service.findById(id);
    }

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public List<E> findAll()
    {
        return service.findAll();
    }
}