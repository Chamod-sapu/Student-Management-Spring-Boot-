//In UserController we mention what are the things we want to do.
package com.studentmanager.demo.Controller;

import com.studentmanager.demo.dto.StudentDTO;

import com.studentmanager.demo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/student" )
public class StudentController {

    @Autowired //constructor autowired now
    private StudentService studentService;

    @GetMapping("/getStudent")
    public List<StudentDTO> getStudents(){

        return studentService.getAllStudents();
    }

    @PostMapping("/addStudent")
    public StudentDTO saveStudent(@Valid @RequestBody StudentDTO studentDTO){
        return studentService.saveStudent(studentDTO);
    };

    @PutMapping("/updateStudent")
    public StudentDTO updateStudent(@RequestBody StudentDTO studentDTO){
        return studentService.updateStudent(studentDTO);
    }

    @DeleteMapping("/deleteStudent")
    public String deleteStudent(@RequestBody StudentDTO studentDTO){
        return studentService.deleteStudent(studentDTO);
    }

    @PatchMapping("/patchStudent")
    public StudentDTO patchStudent(@RequestBody StudentDTO studentDTO){
        return studentService.patchStudent(studentDTO);
    }

}
