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

}
