package com.studentmanager.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // No need to create tables in database. It automatically creates tables.
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    @Id // use to define primary keys
    private int Id;
    private String name;
    private  int age;
    private  String address;
    private long phone;
    private boolean state;

    @ManyToOne
    @JoinColumn(name = "Teacher_ID", referencedColumnName = "TId")
    private Teacher teacher;

}
