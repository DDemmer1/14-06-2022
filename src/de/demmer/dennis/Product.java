package de.demmer.dennis;

public class Product implements Comparable<Product>{
	
	private float price;
	private String name;
	private int id;
	
	
	public Product(float price, String name, int id) {
		super();
		this.price = price;
		this.name = name;
		this.id = id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	
	

	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		if(price < 0) {
			this.price = 0;
		} else {
			this.price = price;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Product [price=" + price + ", name=" + name + ", id=" + id + "]";
	}


	@Override
	public int compareTo(Product anderesProdukt) {

		return this.id - anderesProdukt.getId();
	}
	
	
	

}
