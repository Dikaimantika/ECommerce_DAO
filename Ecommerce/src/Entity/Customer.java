package Entity;

public class Customer {
	private String idCustomer;
	private String username;
	private KodePos kodePos;
	private String gender;
	private String dateOfBirth;
	private String telp;
	private String email;
	private String password;
	
	public Customer() {
		
	}
	
	public Customer(String idCustomer, String username, KodePos kodepos, String gender, String dateOfBirth, String telp, String email, String password) {
		this.idCustomer = idCustomer;
		this.username = username;
		this.kodePos = kodepos;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.telp = telp;
		this.email = email;
		this.password = password;
	}

	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getTelp() {
		return telp;
	}

	public void setTelp(String telp) {
		this.telp = telp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public KodePos getKodePos() {
		return kodePos;
	}

	public void setKodePos(KodePos kodePos) {
		this.kodePos = kodePos;
	}

//	public String pickProduct() {
//		System.out.println("I picked a product");
//	}

// must have CUSTOMER_ORDER
}
