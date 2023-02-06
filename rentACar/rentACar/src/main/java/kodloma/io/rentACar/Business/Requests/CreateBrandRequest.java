package kodloma.io.rentACar.Business.Requests;

import kodloma.io.rentACar.Business.Responses.GetAllBrandsResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {
	private String name;
}
