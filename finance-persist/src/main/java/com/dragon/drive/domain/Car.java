package com.dragon.drive.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Car implements Serializable {

	private static final long serialVersionUID = -1439694093456919567L;

	private Integer id;
	private String platenum;
	private String carlicence;
	private String enginenum;
	private int mileage;

	private String brandName;
	private String catergoryName;
	private String typeName;

	private Insurance insurance;
	
	Set<Accident> accidents = new HashSet<Accident>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlatenum() {
		return platenum;
	}

	public void setPlatenum(String platenum) {
		this.platenum = platenum;
	}

	public String getCarlicence() {
		return carlicence;
	}

	public void setCarlicence(String carlicence) {
		this.carlicence = carlicence;
	}

	public String getEnginenum() {
		return enginenum;
	}

	public void setEnginenum(String enginenum) {
		this.enginenum = enginenum;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCatergoryName() {
		return catergoryName;
	}

	public void setCatergoryName(String catergoryName) {
		this.catergoryName = catergoryName;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Set<Accident> getAccidents() {
		return accidents;
	}

	public void setAccidents(Set<Accident> accidents) {
		this.accidents = accidents;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

}
