package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Person;
import com.automation.attendanceautomationmanagementsystem.model.WorkHistory;
import com.automation.attendanceautomationmanagementsystem.repository.WorkHistoryRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class WorkHistoryServiceImpl extends AbstractBaseServiceImpl<WorkHistory, WorkHistoryRepository>{

    private final WorkHistoryRepository workHistoryRepository;

    public WorkHistoryServiceImpl(WorkHistoryRepository repository, WorkHistoryRepository workHistoryRepository) {
        super(repository);
        this.workHistoryRepository = workHistoryRepository;
    }

    public List<WorkHistory> findByJobTitle(String jobTitle){
        return workHistoryRepository.findByJobTitle(jobTitle);
    }
    public WorkHistory findByOrganizationName(String organizationName){
        return workHistoryRepository.findByOrganizationName(organizationName);
    }
    public List<WorkHistory> findByStartDate(LocalDate startDate){
        return workHistoryRepository.findByStartDate(startDate);
    }
    public List<WorkHistory> findByEndDate(LocalDate endDate){
        return workHistoryRepository.findByEndDate(endDate);
    }
    public List<WorkHistory> findByResponsibility(String responsibility){
        return workHistoryRepository.findByResponsibility(responsibility);
    }
    public List<WorkHistory> findByJobPromotion(String jobPromotion){
        return workHistoryRepository.findByJobPromotion(jobPromotion);
    }
    public boolean existsByCollaborationType(boolean collaborationType){
        return workHistoryRepository.existsByCollaborationType(collaborationType);
    }
    public WorkHistory findWorkHistoriesByPerson(Person person){
        return workHistoryRepository.findWorkHistoriesByPerson(person);
    }
}
