package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.service.AbstractBaseService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class AbstractBaseServiceImpl<E, R extends JpaRepository<E, Long>> implements AbstractBaseService<E>
{
    private final R repository;

    public AbstractBaseServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public E save(E entity) {
        return repository.save(entity);
    }

    @Override
    public E update(E entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public E findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<E> findAll() {
        return repository.findAll();
    }
}