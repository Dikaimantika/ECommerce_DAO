package app;

import connection.MySqlConnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import dao.CustomerDao;
import dao.EwalletDao;
import dao.ProductDao;
import dao.OrderDao;
import dao.ShipmentDao;

import impl.CustomerDaoImpl;
import impl.EwalletDaoImpl;
import impl.ProductDaoImpl;
import impl.OrderDaoImpl;
import impl.ShipmentDaoImpl;

public class MainAppCustomer {
	private static String idCustomer;
	private static String idEwallet;

	public static void main(String[] args) throws Exception {
		
		BufferedReader input = new BufferedReader(new
				InputStreamReader(System.in));
				int pilihan = 0;
				
				do{
					renderMenu();
					pilihan = Integer.parseInt(input.readLine());
					switch(pilihan){
					case 1:myProfile();break;
					case 2:daftarProduct();break;
					case 3:daftarProductByCategory(input);break;
					case 4:ewalletById(input);break;
					case 5:System.out.println("Terima Kasih");break;
					}
				}while(pilihan!=5);
	
}

	private static void renderMenu() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("---------------------");
		System.out.println("C U S T O M E R");
		System.out.println("---------------------");
		System.out.println("[1]My Profile");
		System.out.println("[2]Show Daftar Product");
		System.out.println("[3]Show Product By Category");
		System.out.println("[4]My E-Wallet");
		System.out.println("[5]Keluar");
		System.out.println("----------------------");
		System.out.print("Masukan pilihan: ");
	}
	
	private static void myProfile() throws Exception {
		// TODO Auto-generated method stub
		CustomerDao daoCst = new CustomerDaoImpl(MySqlConnection.getConnection());
		System.out.println("----------------------");
		System.out.println("-----FIND CUSTOMER BY ID-----");
		System.out.println(daoCst.findCstById(idCustomer));
	}

	private static void daftarProduct() throws Exception {
		// TODO Auto-generated method stub
		ProductDao daoPrd = new ProductDaoImpl(MySqlConnection.getConnection());
		System.out.println("----------------------");
		System.out.println("-----DAFTAR PRODUCT-----");
		System.out.println(daoPrd.findPrdAll());
	}

	private static void daftarProductByCategory(BufferedReader input) throws Exception {
		// TODO Auto-generated method stub
		ProductDao daoPrd = new ProductDaoImpl(MySqlConnection.getConnection());
		System.out.println("----------------------");
		System.out.println("-----DAFTAR PRODUCT BY CATEGORY-----");
		System.out.println(daoPrd.findByCategory());
	}

	private static void ewalletById(BufferedReader input) throws Exception {
		// TODO Auto-generated method stub
		EwalletDao daoEwal = new EwalletDaoImpl(MySqlConnection.getConnection());
		System.out.println("----------------------");
		System.out.println("-----MY EWALLET-----");
		System.out.println(daoEwal.findEwallById(idEwallet));
	}

}
