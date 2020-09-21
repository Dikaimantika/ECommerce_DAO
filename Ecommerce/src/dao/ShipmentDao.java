package dao;

import java.util.List;

import Entity.Shipment;

public interface ShipmentDao {
	public int ShipmentInsert(Shipment shipment) throws Exception;
	
	public int ShipmentUpdate(Shipment shipment) throws Exception;
	
	public int ShipmentDelete(Shipment shipment) throws Exception;
	
	public Shipment findShipmentById(String idShipping) throws Exception;
	
	public List<Shipment> findShipmentAll() throws Exception;
	
	public List<Shipment> finsByStatus() throws Exception;
}
