package com.studentmanager.demo.dto;

import com.studentmanager.demo.entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TeacherDTO {
    private int TId;
    private String TName;
    private long TPhone;
    private String DepId;
    private Subject subject;

}
