package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.AssociatedDegree;
import com.automation.attendanceautomationmanagementsystem.model.AssociatedDegree;
import com.automation.attendanceautomationmanagementsystem.service.impl.AssociatedDegreeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/associated_degree")
public class AssociatedDegreeController extends AbstractBaseController<AssociatedDegree, AssociatedDegreeServiceImpl>
{
    private final AssociatedDegreeServiceImpl associatedDegreeServiceImpl;
    
    public AssociatedDegreeController(AssociatedDegreeServiceImpl service, AssociatedDegreeServiceImpl associatedDegreeServiceImpl) {
        super(service);
        this.associatedDegreeServiceImpl = associatedDegreeServiceImpl;
    }

    @GetMapping("/findAssociatedDegreeByDegreeCode/{degreeCode}")
    @ResponseStatus(value = HttpStatus.OK)
    public AssociatedDegree findAssociatedDegreeByDegreeCode(@PathVariable String degreeCode)
    {
        return associatedDegreeServiceImpl.findAssociatedDegreeByDegreeCode(degreeCode);
    }

    @GetMapping("/findAssociatedDegreesByUniversityName/{universityName}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<AssociatedDegree> findAssociatedDegreesByUniversityName(@PathVariable String universityName)
    {
        return associatedDegreeServiceImpl.findAssociatedDegreesByUniversityName(universityName);
    }

    @GetMapping("/findAssociatedDegreesByMajor/{majorName}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<AssociatedDegree> findAssociatedDegreesByMajor(@PathVariable String majorName)
    {
        return associatedDegreeServiceImpl.findAssociatedDegreesByMajor(majorName);
    }

    @GetMapping("/findAssociatedDegreeByStudentNumber/{studentNumber}")
    @ResponseStatus(value = HttpStatus.OK)
    public AssociatedDegree findAssociatedDegreeByStudentNumber(@PathVariable String studentNumber)
    {
        return associatedDegreeServiceImpl.findAssociatedDegreeByStudentNumber(studentNumber);
    }

    @GetMapping("/findAssociatedDegreesByCityStudy/{cityStudyName}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<AssociatedDegree> findAssociatedDegreesByCityStudy(@PathVariable String cityStudyName)
    {
        return associatedDegreeServiceImpl.findAssociatedDegreesByCityStudy(cityStudyName);
    }

    @GetMapping("/findAssociatedDegreesByGraduationDate/{graduationDate}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<AssociatedDegree> findAssociatedDegreesByGraduationDate(@PathVariable LocalDate graduationDate)
    {
        return associatedDegreeServiceImpl.findAssociatedDegreesByGraduationDate(graduationDate);
    }
}