package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Entity.Customer;
import Entity.Ewallet;
import Entity.Product;
import dao.EwalletDao;

public class EwalletDaoImpl implements EwalletDao{
	
	private Connection conn;
	
	public EwalletDaoImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public int EwalletInsert(Ewallet ewallet) throws Exception {
		// TODO Auto-generated method stub
/*		String sql = "insert into e_wallet (Id_Wallet, Id_Customer, Saldo) values(?,?,?)";
		PreparedStatement pst = conn.prepareStatement(sql);
		
		pst.setString(1, "ewal_005");
		pst.setString(2, "customer baruu");
		pst.setString(3, "15000");
		int affectedRow = pst.executeUpdate();
		
		System.out.println(affectedRow +" records inserted");
		return affectedRow;*/
		return 0;
	}

	@Override
	public int EwalletUpdate(Ewallet ewallet) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int EwalletDelete(Ewallet ewallet) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Ewallet findEwallById(String idEwallet) throws Exception {
		// TODO Auto-generated method stub
		Ewallet ewallet = null;
		String sql = "SELECT Id_Wallet, Id_Customer, Saldo from e_wallet where Id_Wallet=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, "ewal_002");
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
			ewallet = new Ewallet();
			System.out.println("ID		: "+ rs.getString("Id_Wallet"));
			System.out.println("Pelanggan	: "+ rs.getString("Id_Customer"));
			System.out.println("Saldo		: "+ rs.getString("Saldo"));
		}
		return ewallet;
//		return null;
	}

	@Override
	public List<Ewallet> findEwalAll() throws Exception {
		// TODO Auto-generated method stub
		List<Ewallet> listOfEwal = new ArrayList<Ewallet>();
		String sql = "SELECT Id_Wallet, Id_Customer FROM e_wallet";
		PreparedStatement pst = conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Ewallet ewallet = new Ewallet();
			System.out.println("ID		: "+ rs.getString("Id_Wallet"));
			System.out.println("Name		: "+ rs.getString("Id_Customer"));
			System.out.println("----------------------");
		}
		return listOfEwal;
//		return null;
	}

}
