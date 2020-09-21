package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Entity.Order;
import dao.OrderDao;

public class OrderDaoImpl implements OrderDao{
	
	private Connection conn;
	
	public OrderDaoImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public int OrderCreate(Order order) throws Exception {
		// TODO Auto-generated method stub
/*		String sql = "insert into order (Id_Order, Date_Order, Id_Customer, Shipping_Price, Total_Price, Payment_Type) values(?,?,?,?,?,?)";
		PreparedStatement pst = conn.prepareStatement(sql);
		
		pst.setString(1, "odr_17");
		pst.setString(2, "2020-09-21");
		pst.setString(3, "cus_003");
		pst.setString(4, "12");
		pst.setString(5, "112");
		pst.setString(6, "ATM");
		int affectedRow = pst.executeUpdate();
		
		System.out.println(affectedRow +" records inserted");
		return affectedRow; */
		return 0;
	}

	@Override
	public int OrderUpdate(Order order) throws Exception {
		// TODO Auto-generated method stub
/*		String sql = "update order set Id_Customer=?, Payment_Type=? where Id_Order=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, "cus_005");
		pst.setString(2, "ATM");
		pst.setString(3, "ord_003");
		int affectedRow = pst.executeUpdate();
		return affectedRow; */
		return 0;
	}

	@Override
	public int OrderDelete(String idOrder) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order findOrdById(String idOrder) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> findOdrAll() throws Exception {
		// TODO Auto-generated method stub
/*		List<Order> listOfOdr = new ArrayList<Order>();
		String sql = "SELECT Id_Order FROM order";
		PreparedStatement pst = conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Order order = new Order();
			System.out.println("ID		: "+ rs.getString("Id_Order"));
//			System.out.println("Tanggal		: "+ rs.getDate("Date_Order"));
//			System.out.println("Pelanggan	: "+ rs.getString("Id_Customer"));
//			System.out.println("Harga Kirim	: "+ rs.getDouble("Shipping_Price"));
//			System.out.println("Harga Total	: "+ rs.getDouble("Total_Price")); 
//			System.out.println("Tipe Bayar	: "+ rs.getString("Payment_Type"));
			System.out.println("----------------------");
		}
		return listOfOdr; */
		return null;
	}

	@Override
	public List<Order> findByCustomer() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> findByDate() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
