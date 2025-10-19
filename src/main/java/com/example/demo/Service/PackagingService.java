package com.example.demo.Service;

import com.example.demo.DTO.PackagingDTO;

import java.util.List;


public interface PackagingService {
    List<PackagingDTO> getPackages();

    PackagingDTO savePackages(PackagingDTO packagingDTO);

    PackagingDTO updatePackages(PackagingDTO packagingDTO);

    String deletePackage(PackagingDTO packagingDTO);
}
