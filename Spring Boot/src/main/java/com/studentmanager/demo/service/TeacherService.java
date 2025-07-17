package com.studentmanager.demo.service;

import com.studentmanager.demo.dto.TeacherDTO;

import java.util.List;

public interface TeacherService {
    List<TeacherDTO> getAllTeachers();

    TeacherDTO saveTeacher(TeacherDTO teacherDTO);

    String deleteTeacher(TeacherDTO teacherDTO);

    TeacherDTO updateTeacher(TeacherDTO teacherDTO);

    TeacherDTO patchTeacher(TeacherDTO teacherDTO);
}
