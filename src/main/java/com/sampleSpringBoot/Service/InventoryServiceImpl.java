package com.sampleSpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleSpringBoot.Dao.InventoryDao;
import com.sampleSpringBoot.Model.InventoryData;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	InventoryDao inventoryDao;
	
	@Override
	public Double calculateNetPrice(long id) {
		InventoryData data = inventoryDao.fetchInventoryDataRecord(id);
		
		if(data.getDiscount()==null || data.getDiscount() == 0)
			return data.getMarketPrice();
		
		else
			return (data.getMarketPrice()-(data.getDiscount()/100)*data.getMarketPrice());
	}

}
