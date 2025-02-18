package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.Mission;
import com.automation.attendanceautomationmanagementsystem.service.MissionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mission")
public class MissionController
{
    private final MissionService missionService;

    public MissionController(MissionService missionService) {
        this.missionService = missionService;
    }

    @PostMapping()
    @ResponseStatus(value = HttpStatus.CREATED)
    public Mission save(@RequestBody Mission mission)
    {
        return missionService.save(mission);
    }

    @PutMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public Mission update(@RequestBody Mission mission)
    {
        return missionService.save(mission);
    }

    @DeleteMapping("/deleteMissionById/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id)
    {
        missionService.deleteById(id);
    }

    @GetMapping("/findMissionById/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public Mission findById(@PathVariable Long id)
    {
        return missionService.findById(id);
    }

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public List<Mission> findAllMissions()
    {
        return missionService.findAll();
    }
}