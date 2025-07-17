package com.studentmanager.demo.Controller;


import com.studentmanager.demo.dto.SubjectDTO;
import com.studentmanager.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/getAllSubjects")
    public List<SubjectDTO> getSubjects(){
        return subjectService.getAllSubjects();
    }

    @PostMapping("/saveSubject")
    public SubjectDTO saveSubject(@RequestBody SubjectDTO subjectDTO){
        return subjectService.saveSubject(subjectDTO);
    }

    @PutMapping("/updateSubject")
    public SubjectDTO updateSubject(@RequestBody SubjectDTO subjectDTO){
        try{
            return subjectService.updateSubject(subjectDTO);

        }catch (Exception e){
            e.printStackTrace();
        }
        return subjectDTO;
    }

    @DeleteMapping("/deleteSubject")
    public SubjectDTO deleteSubject(@RequestBody SubjectDTO subjectDTO){
        return subjectService.deleteSubject(subjectDTO);
    }
}
