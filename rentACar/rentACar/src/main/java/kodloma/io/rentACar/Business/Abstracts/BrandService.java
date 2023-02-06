package kodloma.io.rentACar.Business.Abstracts;
import kodloma.io.rentACar.Business.Requests.CreateBrandRequest;
import kodloma.io.rentACar.Business.Responses.GetAllBrandsResponse;
import kodloma.io.rentACar.Entities.Concretes.Brand;
import java.util.List; 

public interface BrandService {
	List<GetAllBrandsResponse> getAll();
	void add (CreateBrandRequest createBrandRequest);
}
