package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.PhdDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface PhdDegreeRepository extends JpaRepository<PhdDegree, Long>
{
    PhdDegree findPhdDegreeByDegreeCode(String degreeCode);
    List<PhdDegree> findPhdDegreesByUniversityName(String universityName);
    List<PhdDegree> findPhdDegreesByMajor(String majorName);
    PhdDegree findPhdDegreeByStudentNumber(String studentNumber);
    List<PhdDegree> findPhdDegreesByCityStudy(String cityStudyName);
    List<PhdDegree> findPhdDegreesByGraduationDate(LocalDate graduationDate);
}