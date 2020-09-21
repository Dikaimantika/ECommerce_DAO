package dao;

import java.util.List;

import Entity.Order;

public interface OrderDao {
	public int OrderCreate(Order order) throws Exception;
	
	public int OrderUpdate(Order order) throws Exception;
	
	public int OrderDelete(String idOrder) throws Exception;
	
	public Order findOrdById(String idOrder) throws Exception;
	
	public List<Order> findOdrAll() throws Exception;
	
	public List<Order> findByCustomer() throws Exception;
	
	public List<Order> findByDate() throws Exception;
}
