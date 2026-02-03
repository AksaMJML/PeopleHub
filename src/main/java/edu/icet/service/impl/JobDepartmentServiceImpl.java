package edu.icet.service.impl;

import edu.icet.model.dto.JobDepartmentDTO;
import edu.icet.model.entity.JobDepartmentEntity;
import edu.icet.repositery.JobDepartmentRepositery;
import edu.icet.service.JobDepartmentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class JobDepartmentServiceImpl implements JobDepartmentService {

    final JobDepartmentRepositery repositery;
    final ModelMapper mapper;

    @Override
    public void addJobDepartment(JobDepartmentDTO jobDepartmentDTO) {
        repositery.save(mapper.map(jobDepartmentDTO , JobDepartmentEntity.class));
    }

    @Override
    public void updateJobDepartment(JobDepartmentDTO jobDepartmentDTO) {
        repositery.save(mapper.map(jobDepartmentDTO , JobDepartmentEntity.class));
    }

    @Override
    public void deleteJobDepartment(Integer jobId) {
        repositery.deleteById(jobId);
    }

    @Override
    public JobDepartmentDTO searchByJobId(Integer jobId) {
        JobDepartmentEntity jobDepartmentEntity = repositery.findById(jobId).get();
        JobDepartmentDTO jobDepartmentDTO = mapper.map(jobDepartmentEntity, JobDepartmentDTO.class);
        return jobDepartmentDTO;
    }

    @Override
    public List<JobDepartmentDTO> getAllJobDepartments() {
        return List.of();
    }
}
