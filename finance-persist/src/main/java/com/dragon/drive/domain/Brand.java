package com.dragon.drive.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Brand implements Serializable {

	private static final long serialVersionUID = -6043177796869014643L;

	private Integer id;
	private String brandName;

	Set<Category> categories = new HashSet<Category>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

}
