package com.sampleSpringBoot.Dao;

import java.util.List;
import com.sampleSpringBoot.Model.InventoryData;

public interface InventoryDao {

	

	List<InventoryData> fetchInventoryDataRecords();

	

}
