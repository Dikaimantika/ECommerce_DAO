package Entity;

public class Order {
	private String idOrder;
	private String date;
	private Customer customer;
	private Product product;
	private String paymentType;
	private Shipment shipment;
	private double price;
	
	public Order() {
		
	}
	
	public Order(String idOrder, String date, Customer customer, Product product, String paymentType, Shipment shipment, double price) {
		this.idOrder = idOrder;
		this.date = date;
		this.customer = customer;
		this.product = product;
		this.paymentType = paymentType;
		this.shipment = shipment;
		this.price = price;
	}

	public String getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(String idOrder) {
		this.idOrder = idOrder;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public double isPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}

//	public String getCustomerOrder() {
//		
//	}

//	public String getShipment() {
//		
//	}

//	public String getEwallet() {
//		
//	}
	
}
