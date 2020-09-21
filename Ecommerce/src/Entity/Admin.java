package Entity;

public class Admin {
	private String idAdmin;
	private String username;
	private String password;
	private String telp;
	private KodePos kodepos;
	
	public Admin() {
		
	}
	
	public Admin(String idAdmin, String username, String password, String telp, KodePos kodepos) {
		this.idAdmin = idAdmin;
		this.username = username;
		this.password = password;
		this.telp = telp;
		this.kodepos = kodepos;
	}
	
	public String getIdAdmin() {
		return idAdmin;
	}
	
	public void setIdAdmin(String idAdmin) {
		this.idAdmin = idAdmin;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getTelp() {
		return telp;
	}
	
	public void setTelp(String telp) {
		this.telp = telp;
	}
	
	public KodePos getKodepos() {
		return kodepos;
	}
	
	public void setKodepos(KodePos kodepos) {
		this.kodepos = kodepos;
	}

	

//	public String toCustomer_Update() {
//		
//	}

//	public String productUpdate() {
//		
//	}

}
