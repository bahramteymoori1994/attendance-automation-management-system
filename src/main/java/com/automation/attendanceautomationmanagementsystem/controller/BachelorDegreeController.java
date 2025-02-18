package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.BachelorDegree;
import com.automation.attendanceautomationmanagementsystem.service.BachelorDegreeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bachelor_degree")
public class BachelorDegreeController
{
    private final BachelorDegreeService bachelorDegreeService;

    public BachelorDegreeController(BachelorDegreeService bachelorDegreeService) {
        this.bachelorDegreeService = bachelorDegreeService;
    }

    @PostMapping()
    @ResponseStatus(value = HttpStatus.CREATED)
    public BachelorDegree save(@RequestBody BachelorDegree bachelorDegree)
    {
        return bachelorDegreeService.save(bachelorDegree);
    }

    @PutMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public BachelorDegree update(@RequestBody BachelorDegree bachelorDegree) {
        return bachelorDegreeService.update(bachelorDegree);
    }

    @DeleteMapping("/deleteBachelorDegreeById/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id)
    {
        bachelorDegreeService.deleteById(id);
    }

    @GetMapping("/findBachelorDegreeById/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public BachelorDegree findById(@PathVariable Long id)
    {
        return bachelorDegreeService.findById(id);
    }

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public List<BachelorDegree> findAll()
    {
        return bachelorDegreeService.findAll();
    }
}