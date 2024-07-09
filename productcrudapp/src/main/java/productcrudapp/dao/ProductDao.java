package productcrudapp.dao;

import java.util.List;

import productcrudapp.model.Product_Details;

public interface ProductDao {

	public void create(Product_Details product);
	
	public Product_Details select(int id);
	
	public List<Product_Details> selectAll();
	
	public void delete(int id);

}
