package controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import model.dto.CompanyDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CompanyService;

@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
@Tag(name = "Company Controller", description = "APIs for managing companies")
public class CompanyController {

    final CompanyService service;

    @PostMapping("/add")
    public void addCompany(CompanyDTO companyDTO){
        service.addCompany(companyDTO);
    }
}
