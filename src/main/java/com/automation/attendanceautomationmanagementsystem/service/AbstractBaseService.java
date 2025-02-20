package com.automation.attendanceautomationmanagementsystem.service;

import java.util.List;

public interface AbstractBaseService<E>
{
    E save(E entity);
    E update(E entity);
    void deleteById(Long id);
    E findById(Long id);
    List<E> findAll();
}