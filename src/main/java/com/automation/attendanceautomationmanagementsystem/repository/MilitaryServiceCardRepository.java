package com.automation.attendanceautomationmanagementsystem.repository;

import com.automation.attendanceautomationmanagementsystem.model.MilitaryServiceCard;
import com.automation.attendanceautomationmanagementsystem.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface MilitaryServiceCardRepository extends JpaRepository<MilitaryServiceCard, Long> {

    List<MilitaryServiceCard> findByStartDate(LocalDate startDate);
    List<MilitaryServiceCard> findByEndDate(LocalDate endDate);
    List<MilitaryServiceCard> findByCreationDate(LocalDate creationDate);
    MilitaryServiceCard findMilitaryServiceCardByPerson(Person person);
}
