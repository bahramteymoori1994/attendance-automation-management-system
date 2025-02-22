package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.Mission;
import com.automation.attendanceautomationmanagementsystem.model.enums.MissionType;
import com.automation.attendanceautomationmanagementsystem.service.impl.MissionServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/mission")
public class MissionController extends AbstractBaseController<Mission, MissionServiceImpl>
{
    private final MissionServiceImpl missionServiceImpl;

    public MissionController(MissionServiceImpl service, MissionServiceImpl missionServiceImpl) {
        super(service);
        this.missionServiceImpl = missionServiceImpl;
    }

    @GetMapping("/findMissionsByMissionType/{missionType}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Mission> findMissionsByMissionType(@PathVariable MissionType missionType)
    {
        return missionServiceImpl.findMissionsByMissionType(missionType);
    }

    @GetMapping("/findMissionsByMissionTitle/{missionTitle}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Mission> findMissionsByMissionTitle(@PathVariable String missionTitle)
    {
        return missionServiceImpl.findMissionsByMissionTitle(missionTitle);
    }

    @GetMapping("/findMissionsByStartDate/{date}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Mission> findMissionsByStartDate(@PathVariable LocalDate date)
    {
        return missionServiceImpl.findMissionsByStartDate(date);
    }

    @GetMapping("/findMissionsByEndDate/{date}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Mission> findMissionsByEndDate(@PathVariable LocalDate date)
    {
        return missionServiceImpl.findMissionsByEndDate(date);
    }

    @GetMapping("/findMissionsByMissionPlace/{missionPlace}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Mission> findMissionsByMissionPlace(@PathVariable String missionPlace)
    {
        return missionServiceImpl.findMissionsByMissionPlace(missionPlace);
    }

    @GetMapping("/findMissionsByMissionTask/{task}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Mission> findMissionsByMissionTask(@PathVariable String task)
    {
        return missionServiceImpl.findMissionsByMissionTask(task);
    }
}