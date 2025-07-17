package com.studentmanager.demo.Controller;


import com.studentmanager.demo.dto.TeacherDTO;
import com.studentmanager.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/getAllTeachers")
    public List<TeacherDTO> getAllTeachers(){
        return teacherService.getAllTeachers();
    }

    @PostMapping("/saveTeacher")
    public TeacherDTO saveTeacher(@RequestBody TeacherDTO teacherDTO){
        return teacherService.saveTeacher(teacherDTO);
    }

    @DeleteMapping("/deleteTeacher")
    public String deleteTeacher(@RequestBody TeacherDTO teacherDTO){
        return teacherService.deleteTeacher(teacherDTO);
    }

    @PutMapping("/updateTeacher")
    public TeacherDTO updateTeacher(@RequestBody TeacherDTO teacherDTO){
        return teacherService.updateTeacher(teacherDTO);
    }

    @PatchMapping("/patchTeacher")
    public TeacherDTO patchTeacher (@RequestBody TeacherDTO teacherDTO){
        return teacherService.patchTeacher(teacherDTO);
    }
}
