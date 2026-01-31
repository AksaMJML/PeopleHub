package edu.icet.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import edu.icet.model.dto.CompanyDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.icet.service.CompanyService;

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
}
