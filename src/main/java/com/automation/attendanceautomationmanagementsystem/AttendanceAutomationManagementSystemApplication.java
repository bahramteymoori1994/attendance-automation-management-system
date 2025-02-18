package com.automation.attendanceautomationmanagementsystem;

import com.automation.attendanceautomationmanagementsystem.controller.WorkShiftController;
import com.automation.attendanceautomationmanagementsystem.model.WorkShift;
import com.automation.attendanceautomationmanagementsystem.model.enums.WorkShiftType;
import org.springframework.beans.factory.annotation.Autowired;
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
