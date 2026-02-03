package edu.icet.controller;

import edu.icet.model.dto.JobDepartmentDTO;
import edu.icet.service.JobDepartmentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job-departments")
@RequiredArgsConstructor
@Tag(name = "Job Department", description = "APIs for Managing Job Departments")
public class JobDepartmentController {

    final JobDepartmentService service;

    @PostMapping("/add")
    public void addJobDepartment(JobDepartmentDTO  jobDepartmentDTO) {
        service.addJobDepartment(jobDepartmentDTO);
    }
}
