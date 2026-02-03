package edu.icet.controller;

import edu.icet.model.dto.DepartmentDTO;
import edu.icet.service.DepartmentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
@RequiredArgsConstructor
@Tag(name = "Department Controller", description = "APIs for managing departments")
public class DepartmentController {

    final DepartmentService service;

    @PostMapping("/add")
    public void addDepartment(@RequestBody DepartmentDTO departmentDTO) {
        service.addDepartment(departmentDTO);
    }
}
