package kodlama.io.rentACar.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
@Service
public class BrandManager implements BrandService {
private BrandRepository brandRepository;

	public BrandManager(BrandRepository brandRepository) {
	super();
	this.brandRepository = brandRepository;
}
	@Override
	public List<GetAllBrandsResponse> getAll() {
		// TODO Auto-generated method stub
		return brandRepository.findAll();
	}

}
