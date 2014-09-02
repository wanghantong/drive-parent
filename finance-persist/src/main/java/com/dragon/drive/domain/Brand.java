package com.dragon.drive.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Brand implements Serializable {

	private static final long serialVersionUID = -6043177796869014643L;

	private Integer id;
	private String name;

	private List<Catergory> categories = new ArrayList<Catergory>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Catergory> getCategories() {
		return categories;
	}

	public void setCategories(List<Catergory> categories) {
		this.categories = categories;
	}

}
