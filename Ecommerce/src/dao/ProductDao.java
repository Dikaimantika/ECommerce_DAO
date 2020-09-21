package dao;

import java.util.List;

import Entity.Product;

public interface ProductDao {
	public int ProductInsert(Product product) throws Exception;
	
	public int ProductUpdate(Product product) throws Exception;
	
	public int ProductDelete(String idProduct) throws Exception;
	
	public Product findPrdById(String idOrder) throws Exception;
	
	public List<Product> findPrdAll() throws Exception;
	
	public List<Product> findByCategory() throws Exception;
}
