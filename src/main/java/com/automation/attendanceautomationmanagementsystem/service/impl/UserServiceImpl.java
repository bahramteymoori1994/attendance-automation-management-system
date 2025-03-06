package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Department;
import com.automation.attendanceautomationmanagementsystem.model.Organization;
import com.automation.attendanceautomationmanagementsystem.model.Person;
import com.automation.attendanceautomationmanagementsystem.model.User;
import com.automation.attendanceautomationmanagementsystem.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImpl extends AbstractBaseServiceImpl<User, UserRepository>{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository repository, UserRepository userRepository) {
        super(repository);
        this.userRepository = userRepository;
    }

    public User findByUsername(String username) {
        return userRepository.findById(Long.valueOf(username)).orElse(null);
    }

    public boolean existsByUsername(String username) {
        return userRepository.existsUserByUsername(username);
    }

    public User findByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password).orElse(null);
    }

    public List<User> findByLastLogin(LocalDateTime date) {
        return userRepository.findUsersByLastLogin(date);
    }

    public List<User> findUsersByDepartment(Department department) {
        return userRepository.findUsersByDepartment(department);
    }

    public List<User> findUsersByOrganization(Organization organization) {
        return userRepository.findUsersByOrganization(organization);
    }

    public User findUsersByPerson(Person person) {
        return userRepository.findUsersByPerson(person);
    }
}
