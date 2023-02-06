package kodloma.io.rentACar.dataAccess.Abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodloma.io.rentACar.Entities.Concretes.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer> {
	
}
