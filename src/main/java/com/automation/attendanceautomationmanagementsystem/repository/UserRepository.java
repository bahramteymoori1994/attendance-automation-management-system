package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.Department;
import com.automation.attendanceautomationmanagementsystem.model.Organization;
import com.automation.attendanceautomationmanagementsystem.model.Person;
import com.automation.attendanceautomationmanagementsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsUserByUsername(String username);
    User findByUsername(String username);
    Optional<User> findByUsernameAndPassword(String username, String password);
    List<User> findUsersByLastLogin(LocalDateTime date);
    List<User> findUsersByDepartment(Department department);
    List<User> findUsersByOrganization(Organization organization);
    User findUsersByPerson (Person person);
}
