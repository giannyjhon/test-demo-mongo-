package com.example.testdemomongo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import org.springframework.data.annotation.Id;

public class Order {

	@Id
	private Long id;

	private String status;
	private Date createAt;
	private String customer;
	private Double taxesAmounts;
	private Double totalTaxes;
	private Double totalAmount;
	
	private List<Produts> items;
	
	
	
	
	public Order() {
		items = new ArrayList<>();
	}
	

	public Order(Long id, String status, Date createAt, String customer, Double taxesAmounts, Double totalTaxes,
			Double totalAmount, List<Produts> items) {
		super();
		this.id = id;
		this.status = status;
		this.createAt = createAt;
		this.customer = customer;
		this.taxesAmounts = taxesAmounts;
		this.totalTaxes = totalTaxes;
		this.totalAmount = totalAmount;
		this.items = items;
	}

	public List<Produts> getItems() {
		return items;
	}

	public void setItems(List<Produts> items) {
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = new Date();
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Double getTaxesAmounts() {
		return taxesAmounts;
	}

	public void setTaxesAmounts(Double taxesAmounts) {
		this.taxesAmounts = taxesAmounts;
	}

	public Double getTotalTaxes() {
		return totalTaxes;
	}

	public void setTotalTaxes(Double totalTaxes) {
		this.totalTaxes = totalTaxes;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
