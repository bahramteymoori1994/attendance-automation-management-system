package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.MilitaryServiceCard;
import com.automation.attendanceautomationmanagementsystem.model.Person;
import com.automation.attendanceautomationmanagementsystem.repository.MilitaryServiceCardRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MilitaryServiceCardServiceImpl extends AbstractBaseServiceImpl<MilitaryServiceCard, MilitaryServiceCardRepository>{
    private final MilitaryServiceCardRepository militaryServiceCardRepository;

    public MilitaryServiceCardServiceImpl(MilitaryServiceCardRepository repository, MilitaryServiceCardRepository militaryServiceCardRepository) {
        super(repository);
        this.militaryServiceCardRepository = militaryServiceCardRepository;
    }

    public List<MilitaryServiceCard> findByStartDate(LocalDate startDate){
        return militaryServiceCardRepository.findByStartDate(startDate);
    }
    public List<MilitaryServiceCard> findByEndDate(LocalDate endDate){
        return militaryServiceCardRepository.findByEndDate(endDate);
    }
    public List<MilitaryServiceCard> findByCreationDate(LocalDate creationDate){
        return militaryServiceCardRepository.findByCreationDate(creationDate);
    }
    public MilitaryServiceCard findMilitaryServiceCardByPerson(Person person){
        return militaryServiceCardRepository.findMilitaryServiceCardByPerson(person);
    }
}
