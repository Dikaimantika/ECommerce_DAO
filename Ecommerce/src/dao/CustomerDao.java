package dao;

import java.util.List;

import Entity.Customer;

public interface CustomerDao {
	public int CustomerInsert(Customer customer) throws Exception;
	
	public int CustomerUpdate(Customer customer) throws Exception;
	
	public int CustomerDelete(String idCustomer) throws Exception;
	
	public Customer findCstById(String idCustomer) throws Exception;
	
	public List<Customer> findCstAll() throws Exception;
	
	public List<Customer> findByKodepos() throws Exception;
}
