package com.studentmanager.demo.service;

import com.studentmanager.demo.dto.StudentDTO;
import com.studentmanager.demo.dto.TeacherDTO;
import com.studentmanager.demo.entity.Teacher;
import com.studentmanager.demo.repository.TeacherRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TeacherServiceIMPL implements TeacherService{

    @Autowired
    private TeacherRepo teacherRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<TeacherDTO> getAllTeachers(){
        List<Teacher>teacherList = teacherRepo.findAll();

        return modelMapper.map(teacherList, new TypeToken<List<TeacherDTO>>(){}.getType());
    }

    public TeacherDTO saveTeacher(TeacherDTO teacherDTO){
        teacherRepo.save(modelMapper.map(teacherDTO, Teacher.class));
        return teacherDTO;
    }

    public String deleteTeacher(TeacherDTO teacherDTO){
        teacherRepo.delete(modelMapper.map(teacherDTO, Teacher.class));
        return "Teacher deleted successfully";
    }

    public TeacherDTO updateTeacher(TeacherDTO teacherDTO){
        teacherRepo.save(modelMapper.map(teacherDTO, Teacher.class));
        return teacherDTO;
    }

    public TeacherDTO patchTeacher(TeacherDTO teacherDTO){
        teacherRepo.save(modelMapper.map(teacherDTO, Teacher.class));
        return teacherDTO;
    }

}
