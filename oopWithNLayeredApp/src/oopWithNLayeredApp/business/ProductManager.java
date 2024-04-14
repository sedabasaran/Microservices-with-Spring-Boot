package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers; //private List<Logger> loggers 
	
	
	public ProductManager(ProductDao productDao,Logger[] loggers) { //List<Logger>loggers
		this.productDao = productDao;
		this.loggers = loggers;
	}
	// product manager new'lendiğinde bana product dao ver
	
	public void add(Product product) throws Exception {
		
		if(product.getUnitPrice() < 10) {
			throw new Exception("ürün fiyatı 10'dan küçük olamaz.");
		}
		productDao.add(product);
		
		for(Logger logger: loggers) { //[db,mail]
			logger.log(product.getName());
		}
	}

}
