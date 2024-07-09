package productcrudapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import productcrudapp.model.Product_Details;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public int create(Product_Details product) {
		int id = (int)this.hibernateTemplate.save(product);
		return id;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
