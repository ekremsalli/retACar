package kodloma.io.rentACar.Business.Concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodloma.io.rentACar.Business.Abstracts.BrandService;
import kodloma.io.rentACar.Business.Requests.CreateBrandRequest;
import kodloma.io.rentACar.Business.Responses.GetAllBrandsResponse;
import kodloma.io.rentACar.Entities.Concretes.Brand;
import kodloma.io.rentACar.dataAccess.Abstracts.BrandRepository;

@Service
public class BrandManager implements BrandService{
	private BrandRepository brandRepository;
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public List<GetAllBrandsResponse> getAll() {
		
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse> brandResponse = new ArrayList<GetAllBrandsResponse>();
		
		for (Brand brand : brands) {
			GetAllBrandsResponse item = new GetAllBrandsResponse();
			item.setId(brand.getId());
			item.setName(brand.getName());
			brandResponse.add(item);
		}
		
		return brandResponse;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());
		
		this.brandRepository.save(brand);
		
	}
}
