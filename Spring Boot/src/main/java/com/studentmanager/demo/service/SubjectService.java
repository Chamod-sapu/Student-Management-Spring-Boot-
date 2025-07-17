package com.studentmanager.demo.service;

import com.studentmanager.demo.dto.SubjectDTO;

import java.util.List;

public interface SubjectService {


    List<SubjectDTO> getAllSubjects();

    SubjectDTO saveSubject(SubjectDTO subjectDTO);

    SubjectDTO updateSubject(SubjectDTO subjectDTO);

    SubjectDTO deleteSubject(SubjectDTO subjectDTO);
}
