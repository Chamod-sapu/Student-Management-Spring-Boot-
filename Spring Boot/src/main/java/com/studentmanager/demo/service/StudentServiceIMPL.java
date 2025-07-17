package com.studentmanager.demo.service;

import com.studentmanager.demo.dto.StudentDTO;
import com.studentmanager.demo.entity.Student;
import com.studentmanager.demo.exception.NotFoundException;
import com.studentmanager.demo.repository.StudentRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class StudentServiceIMPL implements StudentService{


    private StudentRepo studentRepo;

    @Autowired
    private ModelMapper modelMapper;

    public StudentServiceIMPL(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<StudentDTO> getAllStudents(){
        List<Student>studentList = studentRepo.findAll();

        try {
            //Type listType = new TypeToken<List<StudentDTO>>() {}.getType();
            return modelMapper.map(studentList, new TypeToken<List<StudentDTO>>(){}.getType());
        }catch (NotFoundException e){
            System.out.println("Data not found: " + e.getMessage());
            throw new NotFoundException("Students are not found");
        }
    }

    public StudentDTO saveStudent(StudentDTO studentDTO){
        studentRepo.save(modelMapper.map(studentDTO, Student.class));
        return studentDTO;
    }

    public StudentDTO updateStudent(StudentDTO studentDTO){
        studentRepo.save(modelMapper.map(studentDTO, Student.class));
        return studentDTO;
    }

    public String deleteStudent(StudentDTO studentDTO){
        studentRepo.delete(modelMapper.map(studentDTO, Student.class));
        return "Student Deleted";
    }

    public StudentDTO patchStudent(StudentDTO studentDTO){
        studentRepo.save(modelMapper.map(studentDTO, Student.class));
        return studentDTO;
    }


}