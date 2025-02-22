package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.PhdDegree;
import com.automation.attendanceautomationmanagementsystem.model.PhdDegree;
import com.automation.attendanceautomationmanagementsystem.repository.PhdDegreeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PhdDegreeServiceImpl extends AbstractBaseServiceImpl<PhdDegree, PhdDegreeRepository>
{
    private final PhdDegreeRepository phdDegreeRepository;
    
    public PhdDegreeServiceImpl(PhdDegreeRepository repository, PhdDegreeRepository phdDegreeRepository) {
        super(repository);
        this.phdDegreeRepository = phdDegreeRepository;
    }

    public PhdDegree findPhdDegreeByDegreeCode(String degreeCode)
    {
        return phdDegreeRepository.findPhdDegreeByDegreeCode(degreeCode);
    }

    public List<PhdDegree> findPhdDegreesByUniversityName(String universityName)
    {
        return phdDegreeRepository.findPhdDegreesByUniversityName(universityName);
    }

    public List<PhdDegree> findPhdDegreesByMajor(String majorName)
    {
        return phdDegreeRepository.findPhdDegreesByMajor(majorName);
    }

    public PhdDegree findPhdDegreeByStudentNumber(String studentNumber)
    {
        return phdDegreeRepository.findPhdDegreeByStudentNumber(studentNumber);
    }

    public List<PhdDegree> findPhdDegreesByCityStudy(String cityStudyName)
    {
        return phdDegreeRepository.findPhdDegreesByCityStudy(cityStudyName);
    }

    public List<PhdDegree> findPhdDegreesByGraduationDate(LocalDate graduationDate)
    {
        return phdDegreeRepository.findPhdDegreesByGraduationDate(graduationDate);
    }
}