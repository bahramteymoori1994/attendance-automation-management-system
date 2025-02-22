package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.BachelorDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface BachelorDegreeRepository extends JpaRepository<BachelorDegree, Long>
{
    BachelorDegree findBachelorDegreeByDegreeCode(String degreeCode);
    List<BachelorDegree> findBachelorDegreesByUniversityName(String universityName);
    List<BachelorDegree> findBachelorDegreesByMajor(String majorName);
    BachelorDegree findBachelorDegreeByStudentNumber(String studentNumber);
    List<BachelorDegree> findBachelorDegreesByCityStudy(String cityStudyName);
    List<BachelorDegree> findBachelorDegreesByGraduationDate(LocalDate graduationDate);
}