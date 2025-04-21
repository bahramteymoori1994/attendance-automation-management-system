package com.automation.attendanceautomationmanagementsystem.service;

import com.automation.attendanceautomationmanagementsystem.exception.ServiceException;

import java.util.List;

public interface AbstractBaseService<E>
{
    E save(E entity);
    E update(E entity);
    void deleteById(Long id);
    E findById(Long id) throws ServiceException;
    List<E> findAll();
}