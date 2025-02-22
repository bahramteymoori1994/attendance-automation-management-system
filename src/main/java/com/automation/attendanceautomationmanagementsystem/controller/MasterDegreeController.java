package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.MasterDegree;
import com.automation.attendanceautomationmanagementsystem.model.MasterDegree;
import com.automation.attendanceautomationmanagementsystem.service.impl.MasterDegreeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/master_degree")
public class MasterDegreeController extends AbstractBaseController<MasterDegree, MasterDegreeServiceImpl>
{
    private final MasterDegreeServiceImpl masterDegreeServiceImpl;
    
    public MasterDegreeController(MasterDegreeServiceImpl service, MasterDegreeServiceImpl masterDegreeServiceImpl) {
        super(service);
        this.masterDegreeServiceImpl = masterDegreeServiceImpl;
    }

    @GetMapping("/findMasterDegreeByDegreeCode/{degreeCode}")
    @ResponseStatus(value = HttpStatus.OK)
    public MasterDegree findMasterDegreeByDegreeCode(@PathVariable String degreeCode)
    {
        return masterDegreeServiceImpl.findMasterDegreeByDegreeCode(degreeCode);
    }

    @GetMapping("/findMasterDegreesByUniversityName/{universityName}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<MasterDegree> findMasterDegreesByUniversityName(@PathVariable String universityName)
    {
        return masterDegreeServiceImpl.findMasterDegreesByUniversityName(universityName);
    }

    @GetMapping("/findMasterDegreesByMajor/{majorName}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<MasterDegree> findMasterDegreesByMajor(@PathVariable String majorName)
    {
        return masterDegreeServiceImpl.findMasterDegreesByMajor(majorName);
    }

    @GetMapping("/findMasterDegreeByStudentNumber/{studentNumber}")
    @ResponseStatus(value = HttpStatus.OK)
    public MasterDegree findMasterDegreeByStudentNumber(@PathVariable String studentNumber)
    {
        return masterDegreeServiceImpl.findMasterDegreeByStudentNumber(studentNumber);
    }

    @GetMapping("/findMasterDegreesByCityStudy/{cityStudyName}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<MasterDegree> findMasterDegreesByCityStudy(@PathVariable String cityStudyName)
    {
        return masterDegreeServiceImpl.findMasterDegreesByCityStudy(cityStudyName);
    }

    @GetMapping("/findMasterDegreesByGraduationDate/{graduationDate}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<MasterDegree> findMasterDegreesByGraduationDate(@PathVariable LocalDate graduationDate)
    {
        return masterDegreeServiceImpl.findMasterDegreesByGraduationDate(graduationDate);
    }
}