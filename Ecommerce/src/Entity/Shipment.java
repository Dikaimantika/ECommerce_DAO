package Entity;

public class Shipment {
	private String idShipping;
	private String shippingName;
	private String date;
	private String origin;
	private String description;
	private double price;
	private String status;
	
	public Shipment() {
		
	}
	
	public Shipment(String idShipping, String shippingName, String date, String origin, String description, double price, String status) {
		this.idShipping = idShipping;
		this.shippingName = shippingName;
		this.date = date;
		this.origin = origin;
		this.description = description;
		this.price = price;
		this.status = status;
	}

	public String getShippingName() {
		return shippingName;
	}

	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIdShipping() {
		return idShipping;
	}

	public void setIdShipping(String idShipping) {
		this.idShipping = idShipping;
	}

}
