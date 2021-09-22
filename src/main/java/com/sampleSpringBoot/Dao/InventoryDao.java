package com.sampleSpringBoot.Dao;

import java.util.List;

import com.sampleSpringBoot.Model.InventoryData;

public interface InventoryDao {

	

	List<InventoryData> fetchInventoryDataRecords();

	long addInventoryData(InventoryData details);

	long updateInventory(InventoryData details);

	InventoryData fetchInventoryDataRecord(long id);

	int deleteInventoryData(Long id);

	

}
