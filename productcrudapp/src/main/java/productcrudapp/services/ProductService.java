package productcrudapp.services;

import org.springframework.stereotype.Service;

import productcrudapp.dao.ProductDao;
import productcrudapp.model.Product_Details;

@Service
public class ProductService {
	
	ProductDao productDao;
	
	public int insert(Product_Details product)
	{
		int id = this.productDao.create(product);
		return id;
	}
	
	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	

}
