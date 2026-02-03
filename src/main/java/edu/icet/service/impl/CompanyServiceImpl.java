package edu.icet.service.impl;

import lombok.RequiredArgsConstructor;
import edu.icet.model.dto.CompanyDTO;
import edu.icet.model.entity.CompanyEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import edu.icet.repositery.CompanyRepositery;
import edu.icet.service.CompanyService;

import java.util.ArrayList;
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
        CompanyEntity companyEntity = repositery.findById(id).get();
        CompanyDTO companyDTO = mapper.map(companyEntity, CompanyDTO.class);
        return companyDTO;
    }

    @Override
    public List<CompanyDTO> getAllCompanies() {
        List<CompanyEntity> companyEntities = repositery.findAll();
        ArrayList<CompanyDTO> companyDTOArrayList = new ArrayList<>();
        companyEntities.forEach(companyEntity -> {
            CompanyDTO companyDTO = mapper.map(companyEntity, CompanyDTO.class);
            companyDTOArrayList.add(companyDTO);
        });
        return companyDTOArrayList;
    }
}
