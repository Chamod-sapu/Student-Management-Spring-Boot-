package com.example.demo.Repository;

import com.example.demo.Entity.Packaging;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackagingRepo extends JpaRepository<Packaging, Integer> {
}
