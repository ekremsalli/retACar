package kodloma.io.rentACar.webApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodloma.io.rentACar.Business.Abstracts.BrandService;
import kodloma.io.rentACar.Business.Requests.CreateBrandRequest;
import kodloma.io.rentACar.Business.Responses.GetAllBrandsResponse;
import kodloma.io.rentACar.Entities.Concretes.Brand;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
	private BrandService brandService;
	
	@Autowired
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}
	@GetMapping("/getAll")
	public List<GetAllBrandsResponse> getAll(){
		return brandService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody() CreateBrandRequest createBrandRequest)
	{
		this.brandService.add(createBrandRequest); 
	}

}
