package com.example.testdemomongo.model;



import org.springframework.data.annotation.Id;

public class Produts {

	@Id
	private Long id;

	private String name;
	private String category;
	private String uniPrice;
	private Boolean Active;
	

	public Produts() {


	}

	public Produts(Long id, String name, String category, String uniPrice, Boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.uniPrice = uniPrice;
		Active = active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getUniPrice() {
		return uniPrice;
	}

	public void setUniPrice(String uniPrice) {
		this.uniPrice = uniPrice;
	}

	public Boolean getActive() {
		return Active;
	}

	public void setActive(Boolean active) {
		Active = active;
	}

}
