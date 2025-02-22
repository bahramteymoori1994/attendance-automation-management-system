package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.DiplomaDegree;
import com.automation.attendanceautomationmanagementsystem.service.impl.DiplomaDegreeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/diploma_degree")
public class DiplomaDegreeController extends AbstractBaseController<DiplomaDegree, DiplomaDegreeServiceImpl>
{
    private final DiplomaDegreeServiceImpl diplomaDegreeServiceImpl;

    public DiplomaDegreeController(DiplomaDegreeServiceImpl service, DiplomaDegreeServiceImpl diplomaDegreeServiceImpl) {
        super(service);
        this.diplomaDegreeServiceImpl = diplomaDegreeServiceImpl;
    }

    @GetMapping("/findDiplomaDegreeByDegreeCode/{degreeCode}")
    @ResponseStatus(value = HttpStatus.OK)
    public DiplomaDegree findDiplomaDegreeByDegreeCode(@PathVariable String degreeCode)
    {
        return diplomaDegreeServiceImpl.findDiplomaDegreeByDegreeCode(degreeCode);
    }

    @GetMapping("/findDiplomaDegreesByMajor/{majorName}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<DiplomaDegree> findDiplomaDegreesByMajor(@PathVariable String majorName)
    {
        return diplomaDegreeServiceImpl.findDiplomaDegreesByMajor(majorName);
    }

    @GetMapping("/findDiplomaDegreeByStudentNumber/{studentNumber}")
    @ResponseStatus(value = HttpStatus.OK)
    public DiplomaDegree findDiplomaDegreeByStudentNumber(@PathVariable String studentNumber)
    {
        return diplomaDegreeServiceImpl.findDiplomaDegreeByStudentNumber(studentNumber);
    }

    @GetMapping("/findDiplomaDegreesByCityStudy/{cityStudyName}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<DiplomaDegree> findDiplomaDegreesByCityStudy(@PathVariable String cityStudyName)
    {
        return diplomaDegreeServiceImpl.findDiplomaDegreesByCityStudy(cityStudyName);
    }

    @GetMapping("/findDiplomaDegreesByGraduationDate/{graduationDate}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<DiplomaDegree> findDiplomaDegreesByGraduationDate(@PathVariable LocalDate graduationDate)
    {
        return diplomaDegreeServiceImpl.findDiplomaDegreesByGraduationDate(graduationDate);
    }

    @GetMapping("/findDiplomaDegreesBySchoolName/{schoolName}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<DiplomaDegree> findDiplomaDegreesBySchoolName(@PathVariable String schoolName)
    {
        return diplomaDegreeServiceImpl.findDiplomaDegreesBySchoolName(schoolName);
    }
}