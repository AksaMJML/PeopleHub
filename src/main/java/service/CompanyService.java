package service;

import model.dto.CompanyDTO;

import java.util.List;

public interface CompanyService {
    void addCompany(CompanyDTO companyDTO);
    void updateCompany(CompanyDTO companyDTO);
    void deleteCompany(String id);
    CompanyDTO searchById(String id);
    List<CompanyDTO> getAllCompanies();
}
