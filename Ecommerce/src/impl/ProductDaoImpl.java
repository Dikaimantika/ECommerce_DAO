package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Entity.Admin;
import Entity.Product;
import dao.ProductDao;

public class ProductDaoImpl implements ProductDao{
	
	private Connection conn;
	
	public ProductDaoImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public int ProductInsert(Product product) throws Exception {
		// TODO Auto-generated method stub
		String sql = "insert into product (Id_Product, Product_Name, Merk, Category, Description, Color, Stock, Price, Image) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = conn.prepareStatement(sql);
		
		pst.setString(1, "prd_baru");
		pst.setString(2, "Product 77");
		pst.setString(3, "mer_baru");
		pst.setString(4, "cat_baru");
		pst.setString(5, "desc");
		pst.setString(6, "peach");
		pst.setString(7, "2");
		pst.setString(8, "36");
		pst.setString(9, "img77");
		int affectedRow = pst.executeUpdate();
		
		System.out.println(affectedRow +" records inserted");
		return affectedRow;
//		return 0;
	}

	@Override
	public int ProductUpdate(Product product) throws Exception {
		// TODO Auto-generated method stub
		String sql = "update product set Product_Name=?, Stock=?, Price=? where Id_Product=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, "Somesome");
		pst.setString(2, "5");
		pst.setString(3, "4");
		pst.setString(4, "prd_baru1");
		int affectedRow = pst.executeUpdate();
		return affectedRow;
//		return 0;
	}

	@Override
	public int ProductDelete(String idProduct) throws Exception {
		// TODO Auto-generated method stub
		String sql = "delete from product where Id_Product=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, "prd_baru2");
		int affectedRow = pst.executeUpdate();
		return affectedRow;
//		return 0;
	}

	@Override
	public Product findPrdById(String idOrder) throws Exception {
		// TODO Auto-generated method stub
		Product product = null;
		String sql = "SELECT Id_Product, Product_Name, Merk, Category, Stock, Price from product where Id_Product=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, "prd_015");
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
			product = new Product();
			System.out.println("ID	: "+ rs.getString("Id_Product"));
			System.out.println("Name	: "+ rs.getString("Product_Name"));
			System.out.println("Merk	: "+ rs.getString("Merk"));
			System.out.println("Category: "+ rs.getString("Category"));
			System.out.println("Stock	: "+ rs.getString("Stock"));
			System.out.println("Price	: "+ rs.getString("Price"));
		}
		return product;
//		return null;
	}

	@Override
	public List<Product> findPrdAll() throws Exception {
		// TODO Auto-generated method stub
		List<Product> listOfPrd = new ArrayList<Product>();
		String sql = "SELECT Id_Product, Product_Name, Merk, Category, Color, Stock, Price FROM product";
		PreparedStatement pst = conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Product product = new Product();
			System.out.println("ID		: "+ rs.getString("Id_Product"));
			System.out.println("Name		: "+ rs.getString("Product_Name"));
			System.out.println("Merk		: "+ rs.getString("Merk"));
			System.out.println("Category	: "+ rs.getString("Category"));
			System.out.println("Color		: "+ rs.getString("Color"));
			System.out.println("Stock		: "+ rs.getString("Stock"));
			System.out.println("Price		: "+ rs.getString("Price"));
			System.out.println("----------------------");
		}
		return listOfPrd;
//		return null;
	}

	@Override
	public List<Product> findByCategory() throws Exception {
		// TODO Auto-generated method stub
		List<Product> listOfPrdCt = new ArrayList<Product>();
		String sql = "SELECT Id_Product, Product_Name, Color, Stock, Price FROM product WHERE Category=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, "6s");
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Product product = new Product();
//			System.out.println("Merk		: "+ rs.getString("Merk"));
			System.out.println("ID		: "+ rs.getString("Id_Product"));
			System.out.println("Name		: "+ rs.getString("Product_Name"));
			System.out.println("Color		: "+ rs.getString("Color"));
			System.out.println("Stock		: "+ rs.getString("Stock"));
			System.out.println("Price		: "+ rs.getString("Price"));
			System.out.println("----------------------");
		}
		return listOfPrdCt;
//		return null;
	}

}
