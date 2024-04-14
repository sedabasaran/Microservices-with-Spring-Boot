package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		// Sadece db erişim kodları buraya yazılır.sql
		System.out.println("Jdbc ile veritabanına eklendi");
		
	}

}
