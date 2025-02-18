package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.PhdDegree;
import com.automation.attendanceautomationmanagementsystem.service.PhdDegreeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phd_degree")
public class PhdDegreeController
{
    private final PhdDegreeService phdDegreeService;

    public PhdDegreeController(PhdDegreeService phdDegreeService) {
        this.phdDegreeService = phdDegreeService;
    }

    @PostMapping()
    @ResponseStatus(value = HttpStatus.CREATED)
    public PhdDegree save(@RequestBody PhdDegree phdDegree)
    {
        return phdDegreeService.save(phdDegree);
    }

    @PutMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public PhdDegree update(@RequestBody PhdDegree phdDegree) {
        return phdDegreeService.update(phdDegree);
    }

    @DeleteMapping("/deletePhdDegreeById/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id)
    {
        phdDegreeService.deleteById(id);
    }

    @GetMapping("/findPhdDegreeById/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public PhdDegree findById(@PathVariable Long id)
    {
        return phdDegreeService.findById(id);
    }

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public List<PhdDegree> findAll()
    {
        return phdDegreeService.findAll();
    }
}