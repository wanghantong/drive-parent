package com.dragon.drive.domain;

import java.io.Serializable;
import java.util.Date;

public class Insurance implements Serializable {

	private static final long serialVersionUID = -9217549717335755643L;

	private Integer id;
	private String name;
	private Date insuranceEndtime;
	private Date insuranceStarttime;
	private String protector;
	private int accidentTimes;
	private String information;
	private double cost;
	private boolean status;

	private Car car;

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

	public Date getInsuranceEndtime() {
		return insuranceEndtime;
	}

	public void setInsuranceEndtime(Date insuranceEndtime) {
		this.insuranceEndtime = insuranceEndtime;
	}

	public Date getInsuranceStarttime() {
		return insuranceStarttime;
	}

	public void setInsuranceStarttime(Date insuranceStarttime) {
		this.insuranceStarttime = insuranceStarttime;
	}

	public String getProtector() {
		return protector;
	}

	public void setProtector(String protector) {
		this.protector = protector;
	}

	public int getAccidentTimes() {
		return accidentTimes;
	}

	public void setAccidentTimes(int accidentTimes) {
		this.accidentTimes = accidentTimes;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
