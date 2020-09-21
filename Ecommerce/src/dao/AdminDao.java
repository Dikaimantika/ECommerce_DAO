package dao;

import java.util.List;

import Entity.Admin;

public interface AdminDao {
	public int AdminInsert(Admin admin) throws Exception;
	
	public int AdminUpdate(Admin admin) throws Exception;
	
	public int AdminDelete(String idAdmin) throws Exception;
	
	public Admin findAdmById(String idAmin) throws Exception;
	
	public List<Admin> findAdmAll() throws Exception;
}
