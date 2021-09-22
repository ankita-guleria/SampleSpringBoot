package com.sampleSpringBoot.RestEndPoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sampleSpringBoot.Dao.InventoryDao;
import com.sampleSpringBoot.Model.InventoryData;
import com.sampleSpringBoot.Service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryDataController {
	
	@Autowired
	InventoryDao inventoryDao;
	
	@Autowired
	InventoryService inventoryService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<InventoryData> fetchListOfAdminData() {
		return inventoryDao.fetchInventoryDataRecords();

	}
	
	@GetMapping(path= "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody InventoryData fetchListOfAdminData(@PathVariable("id") long id) {
		return inventoryDao.fetchInventoryDataRecord(id);

	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody long addInventory(@RequestBody InventoryData details) {
		long result = inventoryDao.addInventoryData(details);
		return result;
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody long updateInventory(@RequestBody InventoryData details) {
		long result = inventoryDao.updateInventory(details);
		return result;
	}
	
	@DeleteMapping("/{id}")
	public int deleteEmployee(@PathVariable(value = "id") Long id){
		return inventoryDao.deleteInventoryData(id);
	}
	
	@GetMapping(path= "/{id}/netprice", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Double fetchNetPrice(@PathVariable("id") long id) {
		return inventoryService.calculateNetPrice(id);

	}

}
