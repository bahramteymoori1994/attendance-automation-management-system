package com.automation.attendanceautomationmanagementsystem;

import com.automation.attendanceautomationmanagementsystem.controller.WorkShiftController;
import com.automation.attendanceautomationmanagementsystem.model.WorkShift;
import com.automation.attendanceautomationmanagementsystem.model.enums.WorkShiftType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AttendanceAutomationManagementSystemApplication {

//    private static WorkShiftController workShiftController;
//
//    public AttendanceAutomationManagementSystemApplication(WorkShiftController workShiftController) {
//        this.workShiftController = workShiftController;
//    }

    @Autowired
    private static WorkShiftController workShiftController;

    public static void main(String[] args) {

//        WorkShift workShift = WorkShift.builder()
//                .name("managing")
//                .workShiftCode("4465")
//                .workShiftType(WorkShiftType.NOON)
//                .build();
//
//        AttendanceAutomationManagementSystemApplication.workShiftController.save(workShift);
//        System.out.println(workShiftController.findAll());

        SpringApplication.run(AttendanceAutomationManagementSystemApplication.class, args);
    }
}
