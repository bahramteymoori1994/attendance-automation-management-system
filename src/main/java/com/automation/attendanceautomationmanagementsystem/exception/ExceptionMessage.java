package com.automation.attendanceautomationmanagementsystem.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Setter
@Getter
@Component
public class ExceptionMessage
{
    private boolean isError;
    private String message;
    private LocalDateTime dateTime;
}