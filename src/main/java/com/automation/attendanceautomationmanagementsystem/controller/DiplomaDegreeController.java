package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.DiplomaDegree;
import com.automation.attendanceautomationmanagementsystem.service.DiplomaDegreeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diploma_degree")
public class DiplomaDegreeController
{
    private final DiplomaDegreeService diplomaDegreeService;

    public DiplomaDegreeController(DiplomaDegreeService diplomaDegreeService) {
        this.diplomaDegreeService = diplomaDegreeService;
    }

    @PostMapping()
    @ResponseStatus(value = HttpStatus.CREATED)
    public DiplomaDegree save(@RequestBody DiplomaDegree diplomaDegree)
    {
        return diplomaDegreeService.save(diplomaDegree);
    }

    @PutMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public DiplomaDegree update(@RequestBody DiplomaDegree diplomaDegree) {
        return diplomaDegreeService.update(diplomaDegree);
    }

    @DeleteMapping("/deleteDiplomaDegreeById/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id)
    {
        diplomaDegreeService.deleteById(id);
    }

    @GetMapping("/findDiplomaDegreeById/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public DiplomaDegree findById(@PathVariable Long id)
    {
        return diplomaDegreeService.findById(id);
    }

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public List<DiplomaDegree> findAll()
    {
        return diplomaDegreeService.findAll();
    }
}