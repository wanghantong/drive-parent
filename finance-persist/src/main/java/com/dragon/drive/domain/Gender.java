package com.dragon.drive.domain;

public enum Gender {
	MALE("男"), FEMALE("女");

	private String gender;

	private Gender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

}
