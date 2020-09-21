package Entity;

public class Product {
	private String idProduct;
	private String productName;
	private String merk;
	private String stock;
	private String color;
	private String description;
	private double price;
	private String category;
//	private String image;
	
	public Product() {
		
	}
	
	public Product(String idProduct, String productName, String merk, String stock, String color, String description, 
			double price, String category) {
		this.idProduct = idProduct;
		this.productName = productName;
		this.merk = merk;
		this.stock = stock;
		this.color = color;
		this.description = description;
		this.price = price;
		this.category = category;
	}
	
	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double isPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
