package com.studentmanager.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Teacher {
    @Id
    private int TId;
    private String TName;
    private long TPhone;
    private String DepId;

    @ManyToOne
    @JoinColumn(name="subject_id", referencedColumnName = "subId")
    private Subject subject;
}
