package com.automation.attendanceautomationmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AttendanceAutomationManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AttendanceAutomationManagementSystemApplication.class, args);
    }
}
