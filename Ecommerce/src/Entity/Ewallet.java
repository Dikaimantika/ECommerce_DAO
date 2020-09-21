package Entity;

public class Ewallet {
	private String idEwallet;
	private String ewalletName;
	private Customer customer;
	private double saldo;
	
	public Ewallet() {
		
	}
	
	public Ewallet(String idEwallet, String ewalletName, Customer customer, double saldo) {
		this.idEwallet = idEwallet;
		this.ewalletName = ewalletName;
		this.customer = customer;
		this.saldo = saldo;
	}

	public String getEwalletName() {
		return ewalletName;
	}

	public void setEwalletName(String ewalletName) {
		this.ewalletName = ewalletName;
	}

	public double isSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getIdEwallet() {
		return idEwallet;
	}

	public void setIdEwallet(String idEwallet) {
		this.idEwallet = idEwallet;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

//	public String getCustomer() {
//		
//	}

}
