package productcrudapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import productcrudapp.dao.ProductDao;
import productcrudapp.model.Product_Details;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public void insertOrUpdate(Product_Details product)
	{
		this.productDao.create(product);
	}
	
	public Product_Details product(int pId)
	{
		Product_Details product = this.productDao.select(pId);
		return product;
	}
	
	public List<Product_Details> products()
	{
		List<Product_Details> products = this.productDao.selectAll();
		return products;
	}
	
	public void delete(int id)
	{
		this.productDao.delete(id);
	}
	
	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	

	

}
