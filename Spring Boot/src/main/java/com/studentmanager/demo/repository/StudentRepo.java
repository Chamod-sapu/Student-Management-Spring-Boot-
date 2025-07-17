//In this we define the data types which ae useful for services and controllers

package com.studentmanager.demo.repository;

import com.studentmanager.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Mention as a repo
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
