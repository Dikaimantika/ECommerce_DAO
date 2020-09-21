package dao;

import java.util.List;

import Entity.Ewallet;

public interface EwalletDao {
	public int EwalletInsert(Ewallet ewallet) throws Exception;
	
	public int EwalletUpdate(Ewallet ewallet) throws Exception;
	
	public int EwalletDelete(Ewallet ewallet) throws Exception;
	
	public Ewallet findEwallById(String idEwallet) throws Exception;
	
	public List<Ewallet> findEwalAll() throws Exception;
}
