package com.sampleSpringBoot.Dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.sampleSpringBoot.Model.InventoryData;

@Transactional
@Repository
public class InventoryDaoImpl implements InventoryDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<InventoryData> fetchInventoryDataRecords() {
		// TODO Auto-generated method stub
		String hql = "FROM InventoryData as inventory ORDER BY inventory.id";
		return (List<InventoryData>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public long addInventoryData(InventoryData details) {
		entityManager.persist(details);
		entityManager.flush();
		return details.getId();
	}

	@Override
	public long updateInventory(InventoryData details) {
		InventoryData detailsFromDB = fetchInventoryDataRecord(details.getId());
		
		detailsFromDB.setItemName(details.getItemName());
		detailsFromDB.setMarketPrice(details.getMarketPrice());
		detailsFromDB.setSize(details.getSize());
		detailsFromDB.setDiscount(details.getDiscount());
		
		entityManager.flush();
		return details.getId();
		
	}

	@Override
	public InventoryData fetchInventoryDataRecord(long id) {
		InventoryData data = entityManager.find(InventoryData.class, id);
		return data;

	}

	@Override
	public int deleteInventoryData(Long id) {
		InventoryData inventoryData = entityManager.find(InventoryData.class, id);
		entityManager.remove(inventoryData);
		return 1;
	}

}
