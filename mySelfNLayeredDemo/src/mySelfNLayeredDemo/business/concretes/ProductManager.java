package mySelfNLayeredDemo.business.concretes;

import java.util.List;

import mySelfNLayeredDemo.business.abstracts.ProductService;
import mySelfNLayeredDemo.core.LoggerService;
import mySelfNLayeredDemo.dataAccess.abstracts.ProductDao;
import mySelfNLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	
	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("bu kategoride ürün kabul edilmiyor ");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("ürün eklendi"+product.getNameString());


		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
