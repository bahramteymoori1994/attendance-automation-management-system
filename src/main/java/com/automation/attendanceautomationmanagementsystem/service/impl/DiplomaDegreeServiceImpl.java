package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.DiplomaDegree;
import com.automation.attendanceautomationmanagementsystem.model.DiplomaDegree;
import com.automation.attendanceautomationmanagementsystem.repository.DiplomaDegreeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DiplomaDegreeServiceImpl extends AbstractBaseServiceImpl<DiplomaDegree, DiplomaDegreeRepository>
{
    private final DiplomaDegreeRepository diplomaDegreeRepository;
    
    public DiplomaDegreeServiceImpl(DiplomaDegreeRepository repository, DiplomaDegreeRepository diplomaDegreeRepository) {
        super(repository);
        this.diplomaDegreeRepository = diplomaDegreeRepository;
    }

    public DiplomaDegree findDiplomaDegreeByDegreeCode(String degreeCode)
    {
        return diplomaDegreeRepository.findDiplomaDegreeByDegreeCode(degreeCode);
    }

    public List<DiplomaDegree> findDiplomaDegreesByMajor(String majorName)
    {
        return diplomaDegreeRepository.findDiplomaDegreesByMajor(majorName);
    }

    public DiplomaDegree findDiplomaDegreeByStudentNumber(String studentNumber)
    {
        return diplomaDegreeRepository.findDiplomaDegreeByStudentNumber(studentNumber);
    }

    public List<DiplomaDegree> findDiplomaDegreesByCityStudy(String cityStudyName)
    {
        return diplomaDegreeRepository.findDiplomaDegreesByCityStudy(cityStudyName);
    }

    public List<DiplomaDegree> findDiplomaDegreesByGraduationDate(LocalDate graduationDate)
    {
        return diplomaDegreeRepository.findDiplomaDegreesByGraduationDate(graduationDate);
    }

    public List<DiplomaDegree> findDiplomaDegreesBySchoolName(String schoolName)
    {
        return diplomaDegreeRepository.findDiplomaDegreesBySchoolName(schoolName);
    }
}