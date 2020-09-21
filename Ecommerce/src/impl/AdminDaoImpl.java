package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.MySqlConnection;
import dao.AdminDao;
import Entity.Admin;

public class AdminDaoImpl implements AdminDao{
	
	private Connection conn;
	
	public AdminDaoImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public int AdminInsert(Admin admin) throws Exception {
		// TODO Auto-generated method stub
		String sql = "insert into admin (Id_Admin, Username, Password, Telephone, Alamat, Kode_Pos) values(?,?,?,?,?,?)";
		PreparedStatement pst = conn.prepareStatement(sql);
		
		pst.setString(1, "Id_Adm05");
		pst.setString(2, "Admin keempat");
		pst.setString(3, "tigapass");
		pst.setString(4, "6677888");
		pst.setString(5, "Jl. Jalan");
		pst.setString(6, "61380");
		int affectedRow = pst.executeUpdate();
		
		System.out.println(affectedRow +" records inserted");
		return affectedRow;
	}

	@Override
	public int AdminUpdate(Admin admin) throws Exception {
		// TODO Auto-generated method stub
		String sql = "update admin set Username=?, Password=? where Id_Admin=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, "adora");
		pst.setString(2, "doranewpass");
		pst.setString(3, "Id_Adm06");
		int affectedRow = pst.executeUpdate();
		return affectedRow;
//		return 0;
	}

	@Override
	public int AdminDelete(String idAdmin) throws Exception {
		// TODO Auto-generated method stub
		String sql = "delete from admin where Id_Admin=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, "Id_Adm07");
		int affectedRow = pst.executeUpdate();
		return affectedRow;
//		return 0;
	}

	@Override
	public Admin findAdmById(String idAdmin) throws Exception {
		// TODO Auto-generated method stub
		Admin admin = null;
		String sql = "SELECT Id_Admin, Username, Telephone from admin where Id_Admin=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, "Id_Adm01");
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
			admin = new Admin();
			System.out.println("ID	: "+ rs.getString("Id_Admin"));
			System.out.println("Name	: "+ rs.getString("Username"));
			System.out.println("Telp	: "+ rs.getString("Telephone"));
		}
		return admin;
//		return null;
	}

	@Override
	public List<Admin> findAdmAll() throws Exception {
		// TODO Auto-generated method stub
		List<Admin> listOfAdmin = new ArrayList<Admin>();
		String sql = "SELECT Id_Admin, Username, Password, Telephone, Alamat FROM admin";
		PreparedStatement pst = conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Admin admin = new Admin();
			System.out.println("ID		: "+ rs.getString("Id_Admin"));
			System.out.println("Name		: "+ rs.getString("Username"));
			System.out.println("Password	: "+ rs.getString("Password"));
			System.out.println("Telephone	: "+ rs.getString("Telephone"));
			System.out.println("Alamat		: "+ rs.getString("Alamat"));
			System.out.println("----------------------");
		}
		return listOfAdmin;
	}

}
