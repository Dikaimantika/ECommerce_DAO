package dao;

import java.util.List;

import Entity.KodePos;

public interface KodePosDao {
	public int KodePosInsert(KodePos kodePos) throws Exception;
	
	public int KodePosUpdate(KodePos kodePos) throws Exception;
	
	public int KodePosDelete(KodePos kodePos) throws Exception;
	
	public KodePos findKodeposById(String kodePos) throws Exception;
	
	public List<KodePos> findKodeposAll() throws Exception;
}
