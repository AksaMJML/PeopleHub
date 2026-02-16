package edu.icet.service;

import edu.icet.model.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    void addEmployee(EmployeeDTO employeeDTO);
    void updateEmployee(EmployeeDTO employeeDTO);
    void deleteEmployee(Integer id);
    EmployeeDTO searchBYId(Integer id);
    List<EmployeeDTO> getAllEmployess();
}
