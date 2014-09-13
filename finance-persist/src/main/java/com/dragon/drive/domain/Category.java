package com.dragon.drive.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Category extends Brand implements Serializable {

	private static final long serialVersionUID = -759775690119647411L;

	private Integer id;
	private String categoryName;

	private Set<CarType> cartypes = new HashSet<CarType>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set<CarType> getCartypes() {
		return cartypes;
	}

	public void setCartypes(Set<CarType> cartypes) {
		this.cartypes = cartypes;
	}

}
