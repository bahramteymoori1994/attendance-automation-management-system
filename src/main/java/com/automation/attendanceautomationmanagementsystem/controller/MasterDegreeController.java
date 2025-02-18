package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.MasterDegree;
import com.automation.attendanceautomationmanagementsystem.service.MasterDegreeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/master_degree")
public class MasterDegreeController
{
    private final MasterDegreeService masterDegreeService;

    public MasterDegreeController(MasterDegreeService masterDegreeService) {
        this.masterDegreeService = masterDegreeService;
    }

    @PostMapping()
    @ResponseStatus(value = HttpStatus.CREATED)
    public MasterDegree save(@RequestBody MasterDegree masterDegree)
    {
        return masterDegreeService.save(masterDegree);
    }

    @PutMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public MasterDegree update(@RequestBody MasterDegree masterDegree) {
        return masterDegreeService.update(masterDegree);
    }

    @DeleteMapping("/deleteMasterDegreeById/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id)
    {
        masterDegreeService.deleteById(id);
    }

    @GetMapping("/findMasterDegreeById/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public MasterDegree findById(@PathVariable Long id)
    {
        return masterDegreeService.findById(id);
    }

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public List<MasterDegree> findAll()
    {
        return masterDegreeService.findAll();
    }
}