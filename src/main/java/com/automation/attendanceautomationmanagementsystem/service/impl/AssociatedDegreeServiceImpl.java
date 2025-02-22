package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.AssociatedDegree;
import com.automation.attendanceautomationmanagementsystem.repository.AssociatedDegreeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AssociatedDegreeServiceImpl extends AbstractBaseServiceImpl<AssociatedDegree, AssociatedDegreeRepository>
{
    private final AssociatedDegreeRepository associatedDegreeRepository;

    public AssociatedDegreeServiceImpl(AssociatedDegreeRepository repository, AssociatedDegreeRepository associatedDegreeRepository) {
        super(repository);
        this.associatedDegreeRepository = associatedDegreeRepository;
    }

    public AssociatedDegree findAssociatedDegreeByDegreeCode(String degreeCode)
    {
        return associatedDegreeRepository.findAssociatedDegreeByDegreeCode(degreeCode);
    }

    public List<AssociatedDegree> findAssociatedDegreesByUniversityName(String universityName)
    {
        return associatedDegreeRepository.findAssociatedDegreesByUniversityName(universityName);
    }

    public List<AssociatedDegree> findAssociatedDegreesByMajor(String majorName)
    {
        return associatedDegreeRepository.findAssociatedDegreesByMajor(majorName);
    }

    public AssociatedDegree findAssociatedDegreeByStudentNumber(String studentNumber)
    {
        return associatedDegreeRepository.findAssociatedDegreeByStudentNumber(studentNumber);
    }

    public List<AssociatedDegree> findAssociatedDegreesByCityStudy(String cityStudyName)
    {
        return associatedDegreeRepository.findAssociatedDegreesByCityStudy(cityStudyName);
    }

    public List<AssociatedDegree> findAssociatedDegreesByGraduationDate(LocalDate graduationDate)
    {
        return associatedDegreeRepository.findAssociatedDegreesByGraduationDate(graduationDate);
    }
}