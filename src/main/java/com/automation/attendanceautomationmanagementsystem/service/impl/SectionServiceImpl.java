package com.automation.attendanceautomationmanagementsystem.service.impl;

import com.automation.attendanceautomationmanagementsystem.model.Department;
import com.automation.attendanceautomationmanagementsystem.model.Section;
import com.automation.attendanceautomationmanagementsystem.model.User;
import com.automation.attendanceautomationmanagementsystem.repository.SectionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class SectionServiceImpl extends AbstractBaseServiceImpl<Section, SectionRepository>{
    private final SectionRepository sectionRepository;

    public SectionServiceImpl(SectionRepository repository, SectionRepository sectionRepository) {
        super(repository);
        this.sectionRepository = sectionRepository;
    }

    public List<Section> findByName(String name){
        return sectionRepository.findByName(name);
    }
    public List<Section> findByAddress(String address){
        return sectionRepository.findByAddress(address);
    }
    public Section findByPhoneNumber(String phoneNumber){
        return sectionRepository.findByPhoneNumber(phoneNumber);
    }
    public Section findByInternalCode(String internalCode){
        return sectionRepository.findByInternalCode(internalCode);
    }
    public Section findBySectionNumber(String sectionNumber){
        return sectionRepository.findBySectionNumber(sectionNumber);
    }
    public boolean existsByAccessLevel(boolean accessLevel){
        return sectionRepository.existsByAccessLevel(accessLevel);
    }
    public Section findSectionByDepartment(Department department){
        return sectionRepository.findSectionByDepartment(department);
    }
    public List<Section> findSectionByUserSet(Set<User> userSet){
        return sectionRepository.findSectionByUserSet(userSet);
    }
}
