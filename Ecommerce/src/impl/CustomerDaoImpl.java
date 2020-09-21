package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.CustomerDao;
import Entity.Admin;
import Entity.Customer;

public class CustomerDaoImpl implements CustomerDao{
	
	private Connection conn;
	
	public CustomerDaoImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public int CustomerInsert(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		String sql = "insert into customer (Id_Customer, Username, Telephone, Address, Kode_Pos, Gender, Date_of_birth, Email, Password) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = conn.prepareStatement(sql);
		
		pst.setString(1, "cst_baru");
		pst.setString(2, "customer keenam");
		pst.setString(3, "234567");
		pst.setString(4, "Jl. Baru");
		pst.setString(5, "40111");
		pst.setString(6, "P");
		pst.setString(7, "2000-05-01");
		pst.setString(8, "emailnyabaru");
		pst.setString(9, "passnyabaru");
		int affectedRow = pst.executeUpdate();
		
		System.out.println(affectedRow +" records inserted");
		return affectedRow;
//		return 0;
	}

	@Override
	public int CustomerUpdate(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		String sql = "update customer set Username=?, Password=? where Id_Customer=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, "adorable");
		pst.setString(2, "doranewpass");
		pst.setString(3, "cst_baru");
		int affectedRow = pst.executeUpdate();
		return affectedRow;
//		return 0;
	}

	@Override
	public int CustomerDelete(String idCustomer) throws Exception {
		// TODO Auto-generated method stub
		String sql = "delete from customer where Id_Customer=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, "cst_baru2");
		int affectedRow = pst.executeUpdate();
		return affectedRow;
//		return 0;
	}

	@Override
	public Customer findCstById(String idCustomer) throws Exception {
		// TODO Auto-generated method stub
		Customer customer = null;
		String sql = "SELECT Id_Customer, Username, Telephone, Address, Kode_Pos, Gender, Date_of_birth, Email, Password from customer where Id_Customer=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, "cus_001");
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
			customer = new Customer();
			System.out.println("ID		: "+ rs.getString("Id_Customer"));
			System.out.println("Name		: "+ rs.getString("Username"));
			System.out.println("Telephone	: "+ rs.getString("Telephone"));
			System.out.println("Alamat		: "+ rs.getString("Address"));
			System.out.println("Kode_Pos	: "+ rs.getString("Kode_Pos"));
			System.out.println("Gender		: "+ rs.getString("Gender"));
			System.out.println("Tgl Lahir	: "+ rs.getString("Date_of_birth"));
			System.out.println("Email		: "+ rs.getString("Email"));
			System.out.println("Password	: "+ rs.getString("Password"));
			System.out.println("----------------------");
		}
		return customer;
//		return null;
	}

	@Override
	public List<Customer> findCstAll() throws Exception {
		// TODO Auto-generated method stub
		List<Customer> listOfCst = new ArrayList<Customer>();
		String sql = "SELECT Id_Customer, Username, Telephone, Address, Gender, Date_of_birth, Email, Password FROM customer";
		PreparedStatement pst = conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Customer customer = new Customer();
			System.out.println("ID		: "+ rs.getString("Id_Customer"));
			System.out.println("Name		: "+ rs.getString("Username"));
			System.out.println("Telephone	: "+ rs.getString("Telephone"));
			System.out.println("Alamat		: "+ rs.getString("Address"));
			System.out.println("Gender		: "+ rs.getString("Gender"));
			System.out.println("Tgl Lahir	: "+ rs.getString("Date_of_birth"));
			System.out.println("Email		: "+ rs.getString("Email"));
			System.out.println("Password	: "+ rs.getString("Password"));
			System.out.println("----------------------");
		}
		return listOfCst;
//		return null;
	}

	@Override
	public List<Customer> findByKodepos() throws Exception {
		// TODO Auto-generated method stub
		List<Customer> listOfCstKd = new ArrayList<Customer>();
		String sql = "SELECT Id_Customer, Username, Gender, Kode_Pos FROM customer WHERE Kode_Pos=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, "61500");
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Customer customer = new Customer();
			System.out.println("ID		: "+ rs.getString("Id_Customer"));
			System.out.println("Name		: "+ rs.getString("Username"));
			System.out.println("Gender		: "+ rs.getString("Gender"));
			System.out.println("Kode_Pos	: "+ rs.getString("Kode_Pos"));
			System.out.println("----------------------");
		}
		return listOfCstKd;
//		return null;
	}

}
