package com.example.demo.Service;

import com.example.demo.DTO.PackagingDTO;
import com.example.demo.Entity.Packaging;
import com.example.demo.Repository.PackagingRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PackagingServiceIMPL implements PackagingService {

    @Autowired
    private PackagingRepo packagingRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<PackagingDTO> getPackages() {
        List<Packaging> packagingList = packagingRepo.findAll();
        return modelMapper.map(packagingList, new TypeToken<List<PackagingDTO>>() {
        }.getType());
    }

    public PackagingDTO savePackages(PackagingDTO packagingDTO) {
        packagingRepo.save(modelMapper.map(packagingDTO, Packaging.class));
        return packagingDTO;
    }

    public PackagingDTO updatePackages(PackagingDTO packagingDTO) {
        packagingRepo.save(modelMapper.map(packagingDTO, Packaging.class));
        return packagingDTO;
    }

    public String deletePackage(PackagingDTO packagingDTO) {
        packagingRepo.delete(modelMapper.map(packagingDTO, Packaging.class));
        return "Package deleted successfully";
    }
}
