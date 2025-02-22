package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.AssociatedDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface AssociatedDegreeRepository extends JpaRepository<AssociatedDegree, Long>
{
    AssociatedDegree findAssociatedDegreeByDegreeCode(String degreeCode);
    List<AssociatedDegree> findAssociatedDegreesByUniversityName(String universityName);
    List<AssociatedDegree> findAssociatedDegreesByMajor(String majorName);
    AssociatedDegree findAssociatedDegreeByStudentNumber(String studentNumber);
    List<AssociatedDegree> findAssociatedDegreesByCityStudy(String cityStudyName);
    List<AssociatedDegree> findAssociatedDegreesByGraduationDate(LocalDate graduationDate);
}