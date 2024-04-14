package mySelfNLayeredDemo.business.abstracts;

import java.util.List;

import mySelfNLayeredDemo.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();

}
