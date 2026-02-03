package edu.icet.service;

import edu.icet.model.dto.JobDepartmentDTO;

import java.util.List;

public interface JobDepartmentService {
    void addJobDepartment(JobDepartmentDTO jobDepartmentDTO);
    void updateJobDepartment(JobDepartmentDTO jobDepartmentDTO);
    void deleteJobDepartment(Integer jobId);
    JobDepartmentDTO searchByJobId(Integer jobId);
    List<JobDepartmentDTO> getAllJobDepartments();
}
