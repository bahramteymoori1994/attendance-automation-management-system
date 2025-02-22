package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.MasterDegree;
import com.automation.attendanceautomationmanagementsystem.model.MasterDegree;
import com.automation.attendanceautomationmanagementsystem.repository.MasterDegreeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MasterDegreeServiceImpl extends AbstractBaseServiceImpl<MasterDegree, MasterDegreeRepository>
{
    private final MasterDegreeRepository masterDegreeRepository;
    
    public MasterDegreeServiceImpl(MasterDegreeRepository repository, MasterDegreeRepository masterDegreeRepository) {
        super(repository);
        this.masterDegreeRepository = masterDegreeRepository;
    }

    public MasterDegree findMasterDegreeByDegreeCode(String degreeCode)
    {
        return masterDegreeRepository.findMasterDegreeByDegreeCode(degreeCode);
    }

    public List<MasterDegree> findMasterDegreesByUniversityName(String universityName)
    {
        return masterDegreeRepository.findMasterDegreesByUniversityName(universityName);
    }

    public List<MasterDegree> findMasterDegreesByMajor(String majorName)
    {
        return masterDegreeRepository.findMasterDegreesByMajor(majorName);
    }

    public MasterDegree findMasterDegreeByStudentNumber(String studentNumber)
    {
        return masterDegreeRepository.findMasterDegreeByStudentNumber(studentNumber);
    }

    public List<MasterDegree> findMasterDegreesByCityStudy(String cityStudyName)
    {
        return masterDegreeRepository.findMasterDegreesByCityStudy(cityStudyName);
    }

    public List<MasterDegree> findMasterDegreesByGraduationDate(LocalDate graduationDate)
    {
        return masterDegreeRepository.findMasterDegreesByGraduationDate(graduationDate);
    }
}