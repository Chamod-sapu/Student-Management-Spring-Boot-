package com.studentmanager.demo.service;

import com.studentmanager.demo.dto.SubjectDTO;
import com.studentmanager.demo.entity.Subject;
import com.studentmanager.demo.repository.SubjectRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SubjectServiceIMPL implements SubjectService{

    @Autowired
    private SubjectRepo subjectRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<SubjectDTO> getAllSubjects(){
        List<Subject>subjectList = subjectRepo.findAll();

        return modelMapper.map(subjectList, new TypeToken<List<SubjectDTO>>(){}.getType());
    }

    public SubjectDTO saveSubject(SubjectDTO subjectDTO){
        subjectRepo.save(modelMapper.map(subjectDTO, Subject.class));
        return subjectDTO;
    }

    public SubjectDTO updateSubject(SubjectDTO subjectDTO){
        subjectRepo.save(modelMapper.map(subjectDTO, Subject.class));
        return subjectDTO;
    }

    public SubjectDTO deleteSubject(SubjectDTO subjectDTO){
        subjectRepo.delete(modelMapper.map(subjectDTO, Subject.class));
        return subjectDTO;
    }

}
