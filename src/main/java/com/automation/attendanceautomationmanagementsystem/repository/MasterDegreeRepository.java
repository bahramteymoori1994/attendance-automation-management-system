package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.MasterDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface MasterDegreeRepository extends JpaRepository<MasterDegree, Long>
{
    MasterDegree findMasterDegreeByDegreeCode(String degreeCode);
    List<MasterDegree> findMasterDegreesByUniversityName(String universityName);
    List<MasterDegree> findMasterDegreesByMajor(String majorName);
    MasterDegree findMasterDegreeByStudentNumber(String studentNumber);
    List<MasterDegree> findMasterDegreesByCityStudy(String cityStudyName);
    List<MasterDegree> findMasterDegreesByGraduationDate(LocalDate graduationDate);
}