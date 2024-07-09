package productcrudapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import productcrudapp.model.Product_Details;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	@Override
	public void create(Product_Details product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	
	@Override
	public Product_Details select(int id) {
		Product_Details product = this.hibernateTemplate.get(Product_Details.class, id);
		return product;
	}

	@Override
	public List<Product_Details> selectAll() {
		List<Product_Details> products = this.hibernateTemplate.loadAll(Product_Details.class);
		return products;
	}
	
	@Transactional
	@Override
	public void delete(int id) {
		Product_Details product = this.hibernateTemplate.get(Product_Details.class,id);
		this.hibernateTemplate.delete(product);
		
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
