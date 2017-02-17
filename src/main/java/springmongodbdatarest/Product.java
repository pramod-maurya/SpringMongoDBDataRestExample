package springmongodbdatarest;

import org.springframework.data.annotation.Id;

public class Product {
	
	@Id
	private String id;
	
	private String name;
	private String title;
	private String description;
	private String imageUrl;
	private double price;
	
	
	public Product(String name, String title, String description) {
		this.name = name;
		this.title = title;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Name : "+this.name+" Title : "+this.title+" Description : "+this.description;
	}
	
}
