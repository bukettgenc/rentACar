package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
@Repository
public class InMemoryBrandRepository {
List<Brand> brands;

	public InMemoryBrandRepository() {
	brands=new ArrayList<Brand>();
	brands.add(new Brand(1,"bmw"));
	brands.add(new Brand(2,"mercedes"));
	brands.add(new Brand(3,"fiat"));

	}

}
