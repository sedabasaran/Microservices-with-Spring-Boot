package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		// Sadece db erişim kodları buraya yazılır.sql
		System.out.println("Hibernate ile veritabanına eklendi");
	}

}
