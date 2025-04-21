package com.automation.attendanceautomationmanagementsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ExceptionWrapper
{
    private final ExceptionMessage exceptionMessage;

    public ExceptionWrapper(ExceptionMessage exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    @ExceptionHandler(ServiceException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ResponseEntity<ExceptionMessage> getMessage(ServiceException serviceException)
    {
        exceptionMessage.setError(true);
        exceptionMessage.setMessage(serviceException.getMessage());
        exceptionMessage.setDateTime(LocalDateTime.now());

        return ResponseEntity.badRequest().body(exceptionMessage);
    }
}