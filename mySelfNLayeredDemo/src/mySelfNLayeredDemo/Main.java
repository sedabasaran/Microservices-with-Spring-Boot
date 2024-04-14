package mySelfNLayeredDemo;

import mySelfNLayeredDemo.business.abstracts.ProductService;
import mySelfNLayeredDemo.business.concretes.ProductManager;
import mySelfNLayeredDemo.core.JLoggerManagerAdapter;
import mySelfNLayeredDemo.dataAccess.concretes.HibernateProductDao;
import mySelfNLayeredDemo.entities.concretes.Product;

public class Main {
	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new HibernateProductDao(),new JLoggerManagerAdapter());
		Product product = new Product(1,2,"Elma",12,50);

		productService.add(product);
		
	}
	

}
