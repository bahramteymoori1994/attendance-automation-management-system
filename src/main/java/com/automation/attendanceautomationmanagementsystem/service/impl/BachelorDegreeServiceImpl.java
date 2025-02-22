package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.BachelorDegree;
import com.automation.attendanceautomationmanagementsystem.model.BachelorDegree;
import com.automation.attendanceautomationmanagementsystem.repository.BachelorDegreeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BachelorDegreeServiceImpl extends AbstractBaseServiceImpl<BachelorDegree, BachelorDegreeRepository>
{
    private final BachelorDegreeRepository bachelorDegreeRepository;
    
    public BachelorDegreeServiceImpl(BachelorDegreeRepository repository, BachelorDegreeRepository bachelorDegreeRepository) {
        super(repository);
        this.bachelorDegreeRepository = bachelorDegreeRepository;
    }

    public BachelorDegree findBachelorDegreeByDegreeCode(String degreeCode)
    {
        return bachelorDegreeRepository.findBachelorDegreeByDegreeCode(degreeCode);
    }

    public List<BachelorDegree> findBachelorDegreesByUniversityName(String universityName)
    {
        return bachelorDegreeRepository.findBachelorDegreesByUniversityName(universityName);
    }

    public List<BachelorDegree> findBachelorDegreesByMajor(String majorName)
    {
        return bachelorDegreeRepository.findBachelorDegreesByMajor(majorName);
    }

    public BachelorDegree findBachelorDegreeByStudentNumber(String studentNumber)
    {
        return bachelorDegreeRepository.findBachelorDegreeByStudentNumber(studentNumber);
    }

    public List<BachelorDegree> findBachelorDegreesByCityStudy(String cityStudyName)
    {
        return bachelorDegreeRepository.findBachelorDegreesByCityStudy(cityStudyName);
    }

    public List<BachelorDegree> findBachelorDegreesByGraduationDate(LocalDate graduationDate)
    {
        return bachelorDegreeRepository.findBachelorDegreesByGraduationDate(graduationDate);
    }
}