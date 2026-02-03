package edu.icet.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import edu.icet.model.dto.CompanyDTO;
import org.springframework.web.bind.annotation.*;
import edu.icet.service.CompanyService;

import java.util.List;

@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
@Tag(name = "Company Controller", description = "APIs for managing companies")
public class CompanyController {

    final CompanyService service;

    @PostMapping("/add")
    public void addCompany(@RequestBody CompanyDTO companyDTO){
        service.addCompany(companyDTO);
    }

    @PutMapping("/update")
    public void updateCompany(@RequestBody CompanyDTO companyDTO) {
        service.updateCompany(companyDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteCompany(@PathVariable String id) {
        service.deleteCompany(id);
    }

    @GetMapping("/search-by-id/{id}")
    public CompanyDTO searchById(@PathVariable String id) {
        return service.searchById(id);
    }

    @GetMapping("/get-all")
    public List<CompanyDTO> getAllCompanies() {
        return service.getAllCompanies();
    }
}
