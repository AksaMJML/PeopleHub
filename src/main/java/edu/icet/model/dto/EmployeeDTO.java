package edu.icet.model.dto;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDTO {
    private Integer id;
    private String name;
    private String email;
    private String code;
    private double salary;
    private Date joinedDate;
    private Integer companyId;
}
