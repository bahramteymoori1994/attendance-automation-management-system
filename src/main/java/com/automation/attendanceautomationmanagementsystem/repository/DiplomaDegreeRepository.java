package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.DiplomaDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DiplomaDegreeRepository extends JpaRepository<DiplomaDegree, Long>
{
    DiplomaDegree findDiplomaDegreeByDegreeCode(String degreeCode);
    List<DiplomaDegree> findDiplomaDegreesBySchoolName(String schoolName);
    List<DiplomaDegree> findDiplomaDegreesByMajor(String majorName);
    DiplomaDegree findDiplomaDegreeByStudentNumber(String studentNumber);
    List<DiplomaDegree> findDiplomaDegreesByCityStudy(String cityStudyName);
    List<DiplomaDegree> findDiplomaDegreesByGraduationDate(LocalDate graduationDate);
}