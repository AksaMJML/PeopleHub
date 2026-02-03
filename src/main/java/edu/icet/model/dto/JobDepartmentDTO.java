package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JobDepartmentDTO {
    private Integer jobId;
    private String companyId;
    private Integer departmentId;
    private String departmentName;
    private String description;
    private double salary;

}
