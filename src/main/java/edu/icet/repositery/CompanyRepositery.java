package edu.icet.repositery;

import edu.icet.model.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepositery extends JpaRepository<CompanyEntity , String> {
}
