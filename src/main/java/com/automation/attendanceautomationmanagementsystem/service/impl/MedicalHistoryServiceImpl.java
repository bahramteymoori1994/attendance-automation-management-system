package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.MedicalHistory;
import com.automation.attendanceautomationmanagementsystem.model.Person;
import com.automation.attendanceautomationmanagementsystem.repository.MedicalHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalHistoryServiceImpl extends AbstractBaseServiceImpl<MedicalHistory, MedicalHistoryRepository>{

    private final MedicalHistoryRepository medicalHistoryRepository;

    public MedicalHistoryServiceImpl(MedicalHistoryRepository repository, MedicalHistoryRepository medicalHistoryRepository) {
        super(repository);
        this.medicalHistoryRepository = medicalHistoryRepository;
    }

    public List<MedicalHistory> findByIllness(String illness){
        return medicalHistoryRepository.findByIllness(illness);
    }
    public List<MedicalHistory> findByPreviousIllness(String previousIllness){
        return medicalHistoryRepository.findByPreviousIllness(previousIllness);
    }
    public MedicalHistory findMedicalHistoriesByPerson(Person person){
        return medicalHistoryRepository.findMedicalHistoriesByPerson(person);
    }
}
