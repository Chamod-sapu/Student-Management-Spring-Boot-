package com.studentmanager.demo.service;

import com.studentmanager.demo.dto.StudentDTO;

import java.util.List;

public interface StudentService {

    List<StudentDTO> getAllStudents();

    StudentDTO saveStudent(StudentDTO studentDTO);

    StudentDTO updateStudent(StudentDTO studentDTO);

    String deleteStudent(StudentDTO studentDTO);

    StudentDTO patchStudent(StudentDTO studentDTO);
}
