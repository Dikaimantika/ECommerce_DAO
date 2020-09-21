package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Entity.Shipment;
import dao.ShipmentDao;

public class ShipmentDaoImpl implements ShipmentDao{
	
	private Connection conn;
	
	public ShipmentDaoImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public int ShipmentInsert(Shipment shipment) throws Exception {
		// TODO Auto-generated method stub
/*		String sql = "insert into shipping (Id_Shipping, Id_Order, Date_Shipping, Origin, Destination, Shipping_Price, Status) values(?,?,?,?,?,?,?)";
		PreparedStatement pst = conn.prepareStatement(sql);
		
		pst.setString(1, "shp_05");
		pst.setString(2, "ord_005");
		pst.setString(3, "2020-09-21");
		pst.setString(4, "Bali");
		pst.setString(5, "Kediri");
		pst.setString(6, "17");
		pst.setString(7, "OTW");
		int affectedRow = pst.executeUpdate();
		
		System.out.println(affectedRow +" records inserted");
		return affectedRow; */
		return 0;
	}

	@Override
	public int ShipmentUpdate(Shipment shipment) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ShipmentDelete(Shipment shipment) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Shipment findShipmentById(String idShipping) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Shipment> findShipmentAll() throws Exception {
		// TODO Auto-generated method stub
		List<Shipment> listOfShp = new ArrayList<Shipment>();
		String sql = "SELECT Id_Shipping, Id_Order, Date_Shipping, Shipping_Name, Origin, Destination, Shipping_Price, Status FROM shipping";
		PreparedStatement pst = conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Shipment shipment = new Shipment();
			System.out.println("ID		: "+ rs.getString("Id_Shipping"));
			System.out.println("Order		: "+ rs.getString("Id_Order"));
			System.out.println("Tanggal		: "+ rs.getString("Date_Shipping"));
			System.out.println("Pengiriman	: "+ rs.getString("Shipping_Name"));
			System.out.println("Asal		: "+ rs.getString("Origin"));
			System.out.println("Tujuan		: "+ rs.getString("Destination"));
			System.out.println("Harga		: "+ rs.getString("Shipping_Price"));
			System.out.println("Status		: "+ rs.getString("Status"));
			System.out.println("----------------------");
		}
		return listOfShp;
//		return null;
	}

	@Override
	public List<Shipment> finsByStatus() throws Exception {
		// TODO Auto-generated method stub
		List<Shipment> listOfShp = new ArrayList<Shipment>();
		String sql = "SELECT Id_Shipping, Id_Order, Date_Shipping, Shipping_Name, Origin, Destination, Shipping_Price, Status FROM shipping WHERE Status=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, "OTW");
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Shipment shipment = new Shipment();
			System.out.println("ID		: "+ rs.getString("Id_Shipping"));
			System.out.println("Order		: "+ rs.getString("Id_Order"));
			System.out.println("Tanggal		: "+ rs.getString("Date_Shipping"));
			System.out.println("Pengiriman	: "+ rs.getString("Shipping_Name"));
			System.out.println("Asal		: "+ rs.getString("Origin"));
			System.out.println("Tujuan		: "+ rs.getString("Destination"));
			System.out.println("Harga		: "+ rs.getString("Shipping_Price"));
			System.out.println("Status		: "+ rs.getString("Status"));
			System.out.println("----------------------");
		}
		return listOfShp;
//		return null;
	}

}
