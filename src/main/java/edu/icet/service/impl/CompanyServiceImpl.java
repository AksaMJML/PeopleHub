package edu.icet.service.impl;

import lombok.RequiredArgsConstructor;
import edu.icet.model.dto.CompanyDTO;
import edu.icet.model.entity.CompanyEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import edu.icet.repositery.CompanyRepositery;
import edu.icet.service.CompanyService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CompanyServiceImpl implements CompanyService {

    final CompanyRepositery repositery;
    final ModelMapper mapper;

    @Override
    public void addCompany(CompanyDTO companyDTO) {
        repositery.save(mapper.map(companyDTO , CompanyEntity.class));
    }

    @Override
    public void updateCompany(CompanyDTO companyDTO) {
        repositery.save(mapper.map(companyDTO , CompanyEntity.class));
    }

    @Override
    public void deleteCompany(String id) {
        repositery.deleteById(id);

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
