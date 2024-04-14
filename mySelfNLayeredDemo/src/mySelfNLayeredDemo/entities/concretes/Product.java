package mySelfNLayeredDemo.entities.concretes;

public class Product {
	public int id;
	public int categoryId;
	public String nameString;
	public int unitInPrice;
	public int unitsInStock;
	
	public Product() {
		
	}
	
	
	
	public Product(int id, int categoryId, String nameString, int unitInPrice, int unitsInStock) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.nameString = nameString;
		this.unitInPrice = unitInPrice;
		this.unitsInStock = unitsInStock;
	}



	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCategoryId() {
		return id;
	}
	
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getNameString() {
		return nameString;
	}
	
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	
	public int getUnitInPrice() {
		return unitInPrice;
	}
	
	public void setGetInPrice(int unitInPrice) {
		this.unitInPrice = unitInPrice;
	}
	
	public int getUnitInStock() {
		return unitsInStock;
	}
	public void setUnitInStock(int unitInStock) {
		this.unitsInStock = unitInStock;		
	}
	

	

}
