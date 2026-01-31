package repositery;

import model.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepositery extends JpaRepository<CompanyEntity , String> {
}
