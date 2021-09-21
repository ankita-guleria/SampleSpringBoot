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

@RestController
@RequestMapping("/inventory")
public class InventoryDataController {
	
	@Autowired
	InventoryDao inventoryDao;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<InventoryData> fetchListOfAdminData() {
		return inventoryDao.fetchInventoryDataRecords();

	}

}
