package com.automation.attendanceautomationmanagementsystem.controller;

import com.automation.attendanceautomationmanagementsystem.model.PhdDegree;
import com.automation.attendanceautomationmanagementsystem.service.impl.PhdDegreeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/phd_degree")
public class PhdDegreeController extends AbstractBaseController<PhdDegree, PhdDegreeServiceImpl>
{
    private final PhdDegreeServiceImpl phdDegreeServiceImpl;

    public PhdDegreeController(PhdDegreeServiceImpl service, PhdDegreeServiceImpl phdDegreeServiceImpl) {
        super(service);
        this.phdDegreeServiceImpl = phdDegreeServiceImpl;
    }

    @GetMapping("/findPhdDegreeByDegreeCode/{degreeCode}")
    @ResponseStatus(value = HttpStatus.OK)
    public PhdDegree findPhdDegreeByDegreeCode(@PathVariable String degreeCode)
    {
        return phdDegreeServiceImpl.findPhdDegreeByDegreeCode(degreeCode);
    }

    @GetMapping("/findPhdDegreesByUniversityName/{universityName}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<PhdDegree> findPhdDegreesByUniversityName(@PathVariable String universityName)
    {
        return phdDegreeServiceImpl.findPhdDegreesByUniversityName(universityName);
    }

    @GetMapping("/findPhdDegreesByMajor/{majorName}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<PhdDegree> findPhdDegreesByMajor(@PathVariable String majorName)
    {
        return phdDegreeServiceImpl.findPhdDegreesByMajor(majorName);
    }

    @GetMapping("/findPhdDegreeByStudentNumber/{studentNumber}")
    @ResponseStatus(value = HttpStatus.OK)
    public PhdDegree findPhdDegreeByStudentNumber(@PathVariable String studentNumber)
    {
        return phdDegreeServiceImpl.findPhdDegreeByStudentNumber(studentNumber);
    }

    @GetMapping("/findPhdDegreesByCityStudy/{cityStudyName}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<PhdDegree> findPhdDegreesByCityStudy(@PathVariable String cityStudyName)
    {
        return phdDegreeServiceImpl.findPhdDegreesByCityStudy(cityStudyName);
    }

    @GetMapping("/findPhdDegreesByGraduationDate/{graduationDate}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<PhdDegree> findPhdDegreesByGraduationDate(@PathVariable LocalDate graduationDate)
    {
        return phdDegreeServiceImpl.findPhdDegreesByGraduationDate(graduationDate);
    }
}