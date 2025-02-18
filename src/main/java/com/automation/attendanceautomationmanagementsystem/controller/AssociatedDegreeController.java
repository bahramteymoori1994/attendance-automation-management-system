package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.AssociatedDegree;
import com.automation.attendanceautomationmanagementsystem.service.AssociatedDegreeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/associated_degree")
public class AssociatedDegreeController
{
    private final AssociatedDegreeService associatedDegreeService;

    public AssociatedDegreeController(AssociatedDegreeService associatedDegreeService) {
        this.associatedDegreeService = associatedDegreeService;
    }

    @PostMapping()
    @ResponseStatus(value = HttpStatus.CREATED)
    public AssociatedDegree save(@RequestBody AssociatedDegree associatedDegree)
    {
        return associatedDegreeService.save(associatedDegree);
    }

    @PutMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public AssociatedDegree update(@RequestBody AssociatedDegree associatedDegree) {
        return associatedDegreeService.update(associatedDegree);
    }

    @DeleteMapping("/deleteAssociatedDegreeById/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id)
    {
        associatedDegreeService.deleteById(id);
    }

    @GetMapping("/findAssociatedDegreeById/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public AssociatedDegree findById(@PathVariable Long id)
    {
        return associatedDegreeService.findById(id);
    }

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public List<AssociatedDegree> findAll()
    {
        return associatedDegreeService.findAll();
    }
}