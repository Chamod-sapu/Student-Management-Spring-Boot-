package com.studentmanager.demo.dto;

import com.studentmanager.demo.entity.Teacher;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Data handling support. from lombok. Automatically creates getters, setters, for-each
@NoArgsConstructor // Creates a plane constructor without arguments.
@AllArgsConstructor //Creates a constructor with one constructor
public class StudentDTO { // Model in Node

    private int Id;

    @NotNull(message = "Message is required")
    @Size(min = 2, max = 50, message = "Name must be 2-50 characters")
    private String name;

    @Min(value = 6, message = "Age must be at least 6")
    private  int age;

    private  String address;
    private long phone;
    private boolean state;
    private Teacher teacher;

}
