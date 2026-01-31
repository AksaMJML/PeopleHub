package service.impl;

import lombok.RequiredArgsConstructor;
import model.dto.CompanyDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import repositery.CompanyRepositery;
import service.CompanyService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CompanyServiceImp implements CompanyService {

    final CompanyRepositery repositery;
    final ModelMapper mapper;

    @Override
    public void addCompany(CompanyDTO companyDTO) {

    }

    @Override
    public void updateCompany(CompanyDTO companyDTO) {

    }

    @Override
    public void deleteCompany(String id) {

    }

    @Override
    public CompanyDTO searchById(String id) {
        return null;
    }

    @Override
    public List<CompanyDTO> getAllCompanies() {
        return List.of();
    }
}
