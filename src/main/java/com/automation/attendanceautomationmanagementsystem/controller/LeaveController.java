package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.Leave;
import com.automation.attendanceautomationmanagementsystem.service.LeaveService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("leave")
public class LeaveController
{
    private final LeaveService leaveService;

    public LeaveController(LeaveService leaveService) {
        this.leaveService = leaveService;
    }

    @PostMapping()
    @ResponseStatus(value = HttpStatus.CREATED)
    public Leave save(@RequestBody Leave leave)
    {
        return leaveService.save(leave);
    }

    @PutMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public Leave update(@RequestBody Leave leave)
    {
        return leaveService.update(leave);
    }

    @DeleteMapping("/deleteLeaveById/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id)
    {
        leaveService.deleteById(id);
    }

    @GetMapping("/findLeaveById/{id}")
    @ResponseStatus(value = HttpStatus.OK)

    public Leave findById(@PathVariable Long id)
    {
        return leaveService.findById(id);
    }

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public List<Leave> findAll()
    {
        return leaveService.findAll();
    }
}