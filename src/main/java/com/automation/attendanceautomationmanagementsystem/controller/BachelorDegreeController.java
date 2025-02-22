package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.BachelorDegree;
import com.automation.attendanceautomationmanagementsystem.model.BachelorDegree;
import com.automation.attendanceautomationmanagementsystem.service.impl.BachelorDegreeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/bachelor_degree")
public class BachelorDegreeController extends AbstractBaseController<BachelorDegree, BachelorDegreeServiceImpl>
{
    private final BachelorDegreeServiceImpl bachelorDegreeServiceImpl;
    
    public BachelorDegreeController(BachelorDegreeServiceImpl service, BachelorDegreeServiceImpl bachelorDegreeServiceImpl) {
        super(service);
        this.bachelorDegreeServiceImpl = bachelorDegreeServiceImpl;
    }

    @GetMapping("/findBachelorDegreeByDegreeCode/{degreeCode}")
    @ResponseStatus(value = HttpStatus.OK)
    public BachelorDegree findBachelorDegreeByDegreeCode(@PathVariable String degreeCode)
    {
        return bachelorDegreeServiceImpl.findBachelorDegreeByDegreeCode(degreeCode);
    }

    @GetMapping("/findBachelorDegreesByUniversityName/{universityName}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<BachelorDegree> findBachelorDegreesByUniversityName(@PathVariable String universityName)
    {
        return bachelorDegreeServiceImpl.findBachelorDegreesByUniversityName(universityName);
    }

    @GetMapping("/findBachelorDegreesByMajor/{majorName}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<BachelorDegree> findBachelorDegreesByMajor(@PathVariable String majorName)
    {
        return bachelorDegreeServiceImpl.findBachelorDegreesByMajor(majorName);
    }

    @GetMapping("/findBachelorDegreeByStudentNumber/{studentNumber}")
    @ResponseStatus(value = HttpStatus.OK)
    public BachelorDegree findBachelorDegreeByStudentNumber(@PathVariable String studentNumber)
    {
        return bachelorDegreeServiceImpl.findBachelorDegreeByStudentNumber(studentNumber);
    }

    @GetMapping("/findBachelorDegreesByCityStudy/{cityStudyName}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<BachelorDegree> findBachelorDegreesByCityStudy(@PathVariable String cityStudyName)
    {
        return bachelorDegreeServiceImpl.findBachelorDegreesByCityStudy(cityStudyName);
    }

    @GetMapping("/findBachelorDegreesByGraduationDate/{graduationDate}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<BachelorDegree> findBachelorDegreesByGraduationDate(@PathVariable LocalDate graduationDate)
    {
        return bachelorDegreeServiceImpl.findBachelorDegreesByGraduationDate(graduationDate);
    }
}