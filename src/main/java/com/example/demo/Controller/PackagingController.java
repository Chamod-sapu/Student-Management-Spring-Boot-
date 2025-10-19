package com.example.demo.Controller;

import com.example.demo.DTO.PackagingDTO;
import com.example.demo.Service.PackagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/factory/packaging")
public class PackagingController {

    @Autowired
    private PackagingService packagingService;

    @GetMapping("/getPackages")
    public List<PackagingDTO> getPackages() {
        return packagingService.getPackages();
    }

    @PostMapping("/savePackage")
    public PackagingDTO savePackages(@RequestBody PackagingDTO packagingDTO) {
        return packagingService.savePackages(packagingDTO);
    }

    @PutMapping("/updatePackage")
    public PackagingDTO updatePackages(@RequestBody PackagingDTO packagingDTO) {
        return packagingService.updatePackages(packagingDTO);
    }

    @DeleteMapping("/deletePackage")
    public String deletePackage(@RequestBody PackagingDTO packagingDTO) {
        return packagingService.deletePackage(packagingDTO);
    }

}
