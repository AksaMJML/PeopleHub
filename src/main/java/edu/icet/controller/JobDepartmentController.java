package edu.icet.controller;

import edu.icet.model.dto.JobDepartmentDTO;
import edu.icet.service.JobDepartmentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job-departments")
@RequiredArgsConstructor
@Tag(name = "Job Department", description = "APIs for Managing Job Departments")
public class JobDepartmentController {

    final JobDepartmentService service;

    @PostMapping("/add")
    public void addJobDepartment(@RequestBody JobDepartmentDTO  jobDepartmentDTO) {
        service.addJobDepartment(jobDepartmentDTO);
    }

    @PutMapping("/update")
    public void updateJobDepartment(@RequestBody JobDepartmentDTO  jobDepartmentDTO) {
        service.updateJobDepartment(jobDepartmentDTO);
    }

    @DeleteMapping("/delete-by-id/{jobId}")
    public void deleteJobDepartment(@PathVariable Integer jobId) {
        service.deleteJobDepartment(jobId);
    }

    @GetMapping("/search-by-id/{jobId}")
    public JobDepartmentDTO searchByJobId(@PathVariable Integer jobId) {
        return service.searchByJobId(jobId);
    }

    @GetMapping("/get-all")
    public List<JobDepartmentDTO> getAllJobDepartments() {
        return service.getAllJobDepartments();
    }
}
