package app;

import connection.MySqlConnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Entity.Admin;
import Entity.Customer;
import Entity.Ewallet;
import Entity.Order;
import Entity.Product;
import Entity.Shipment;

import dao.AdminDao;
import dao.CustomerDao;
import dao.EwalletDao;
import dao.ProductDao;
import dao.OrderDao;
import dao.ShipmentDao;

import impl.AdminDaoImpl;
import impl.CustomerDaoImpl;
import impl.EwalletDaoImpl;
import impl.ProductDaoImpl;
import impl.OrderDaoImpl;
import impl.ShipmentDaoImpl;


public class MainApp {
	private static Admin admin;
	private static String idAdmin;
	private static Customer customer;
	private static String idCustomer;
	private static Product product;
	private static String idProduct;
	private static String idOrder;
	private static Order order;
	private static Ewallet ewallet;
	private static String idEwallet;
	private static Shipment shipment;

	public static void main(String[] args) throws Exception {
				
		BufferedReader input = new BufferedReader(new
				InputStreamReader(System.in));
				int pilihan = 0;
				
				do{
					renderMenu();
					pilihan = Integer.parseInt(input.readLine());
					switch(pilihan){
					case 1:daftarAdmin();break;
					case 2:daftarCustomer(input);break;
					case 3:deleteCustomer(input);break;
					case 4:daftarProduct(input);break;
					case 5:inputProduct(input);break;
					case 6:updateProduct(input);break;
					case 7:deleteProduct(input);break;
					case 8:daftarShipment(input);break;
					case 9:daftarEwallet(input); break;
					case 10:System.out.println("Terima Kasih");break;
					}
				}while(pilihan!=10);
				
/*		
		System.out.println("-----INSERT ADMIN-----");
		System.out.println(daoAdmin.AdminInsert(admin));
		System.out.println("-----UPDATE ADMIN-----");
		System.out.println(daoAdmin.AdminUpdate(admin));
		System.out.println("-----DELETE ADMIN-----");
		System.out.println(daoAdmin.AdminDelete(idAdmin));
		System.out.println("-----FIND ADMIN BY ID-----");
		System.out.println(daoAdmin.findAdmById(idAdmin)); 
			
		System.out.println("-----INSERT CUSTOMER-----");
		System.out.println(daoCst.CustomerInsert(customer));
		System.out.println("-----UPDATE CUSTOMER-----");
		System.out.println(daoCst.CustomerUpdate(customer));
		System.out.println("-----FIND CUSTOMER BY KODE POS-----");
		System.out.println(daoCst.findByKodepos()); 		
		
		
		System.out.println("-----FIND BY ID PRODUCT-----");
		System.out.println(daoPrd.findPrdById(idOrder));
		System.out.println("-----FIND BY CATEGORY PRODUCT-----");
		System.out.println(daoPrd.findByCategory()); 
		
		
		OrderDao daoOrd = new OrderDaoImpl(MySqlConnection.getConnection());
		System.out.println("-----DAFTAR ORDER-----");
		System.out.println(daoOrd.findOdrAll()); 
		System.out.println("-----INSERT ORDER-----");
		System.out.println(daoOrd.OrderCreate(order));
		System.out.println("-----UPDATE ORDER-----");
		System.out.println(daoOrd.OrderUpdate(order));
		

		System.out.println("-----INSERT EWALLET-----");
		System.out.println(daoEwal.EwalletInsert(ewallet));
		System.out.println("-----FIND BY ID EWALLET-----");
		System.out.println(daoEwal.findEwallById(idEwallet));
		
		
		System.out.println("-----INSERT Shipment-----");
		System.out.println(daoShp.ShipmentInsert(shipment));
		System.out.println("-----FIND BY STATUS Shipment-----");
		System.out.println(daoShp.finsByStatus()); */
	}
	
	private static void renderMenu() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("---------------------");
		System.out.println("A D M I N");
		System.out.println("---------------------");
		System.out.println("[1]Daftar Admin");
		System.out.println("[2]Daftar Customer");
		System.out.println("[3]Delete Customer");
		System.out.println("[4]Daftar Product");
		System.out.println("[5]Input Product");
		System.out.println("[6]Update Product");
		System.out.println("[7]Delete Product");
		System.out.println("[8]Daftar Shipment");
		System.out.println("[9]Daftar E-Wallet");
		System.out.println("[10]Keluar");
		System.out.println("----------------------");
		System.out.print("Masukan pilihan: ");
	}
	
	private static void daftarAdmin() throws Exception {
		// TODO Auto-generated method stub
		AdminDao daoAdmin = new AdminDaoImpl(MySqlConnection.getConnection());
		System.out.println("----------------------");
		System.out.println("-----DAFTAR ADMIN-----");
		System.out.println(daoAdmin.findAdmAll());
	}
	
	private static void daftarCustomer(BufferedReader input) throws Exception{
		// TODO Auto-generated method stub
		CustomerDao daoCst = new CustomerDaoImpl(MySqlConnection.getConnection());
		System.out.println("----------------------");
		System.out.println("-----DAFTAR CUSTOMER-----");
		System.out.println(daoCst.findCstAll());
	}
	
	private static void deleteCustomer(BufferedReader input) throws Exception {
		// TODO Auto-generated method stub
		CustomerDao daoCst = new CustomerDaoImpl(MySqlConnection.getConnection());
		System.out.println("----------------------");
		System.out.println("-----DELETE CUSTOMER-----");
		System.out.println(daoCst.CustomerDelete(idCustomer));
	}
	
	private static void daftarProduct(BufferedReader input) throws Exception {
		// TODO Auto-generated method stub
		ProductDao daoPrd = new ProductDaoImpl(MySqlConnection.getConnection());
		System.out.println("----------------------");
		System.out.println("-----DAFTAR PRODUCT-----");
		System.out.println(daoPrd.findPrdAll());
	}
	
	private static void inputProduct(BufferedReader input) throws Exception {
		// TODO Auto-generated method stub
		ProductDao daoPrd = new ProductDaoImpl(MySqlConnection.getConnection());
		System.out.println("----------------------");
		System.out.println("-----INSERT PRODUCT-----");
		System.out.println(daoPrd.ProductInsert(product));		
	}
	
	private static void updateProduct(BufferedReader input) throws Exception {
		// TODO Auto-generated method stub
		ProductDao daoPrd = new ProductDaoImpl(MySqlConnection.getConnection());
		System.out.println("----------------------");
		System.out.println("-----UPDATE PRODUCT-----");
		System.out.println(daoPrd.ProductUpdate(product));
	}
	
	private static void deleteProduct(BufferedReader input) throws Exception {
		// TODO Auto-generated method stub
		ProductDao daoPrd = new ProductDaoImpl(MySqlConnection.getConnection());
		System.out.println("----------------------");
		System.out.println("-----DELETE PRODUCT-----");
		System.out.println(daoPrd.ProductDelete(idProduct));
	}

	private static void daftarShipment(BufferedReader input) throws Exception {
		// TODO Auto-generated method stub
		ShipmentDao daoShp = new ShipmentDaoImpl(MySqlConnection.getConnection());
		System.out.println("----------------------");
		System.out.println("-----DAFTAR Shipment-----");
		System.out.println(daoShp.findShipmentAll());
	}
	
	private static void daftarEwallet(BufferedReader input) throws Exception {
		// TODO Auto-generated method stub
		EwalletDao daoEwal = new EwalletDaoImpl(MySqlConnection.getConnection());
		System.out.println("----------------------");
		System.out.println("-----DAFTAR EWALLET-----");
		System.out.println(daoEwal.findEwalAll());
	}

}
