package edu.icet.repositery;

import edu.icet.model.entity.JobDepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDepartmentRepositery extends JpaRepository<JobDepartmentEntity , Integer> {
}
