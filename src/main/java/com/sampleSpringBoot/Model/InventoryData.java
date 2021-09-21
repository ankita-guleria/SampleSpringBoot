package com.sampleSpringBoot.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "InventoryData")
public class InventoryData {

	@Column(name = "inventoryId", unique = true, nullable = false)
	@GenericGenerator(name = "inventorySequence", strategy = "sequence", parameters = {
			@org.hibernate.annotations.Parameter(name = "inventorySequence", value = "sequence"),
			@org.hibernate.annotations.Parameter(name = "allocationSize", value = "1"), })
	@GeneratedValue(generator = "inventorySequence", strategy = GenerationType.SEQUENCE)
	@Id
	private long id;
	@Column(name = "itemName")
	private String itemName;
	@Column(name = "marketPrice")
	private Double marketPrice;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}
}
