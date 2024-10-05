package com.design.patterns.builder;

import java.time.LocalDate;

//A product in builder pattern
public class UserWebDTO implements UserDTO {

	private String name;

	private String address;

	private LocalDate birthday;

	public UserWebDTO(String name, String address, LocalDate birthday) {
		this.name = name;
		this.address = address;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public LocalDate getBirthDay() {
		return birthday;
	}

	@Override
	public String toString() {
		return "name=" + name + "\n birthday=" + birthday + "\naddress=" + address;
	}

	@Override
	public LocalDate getBirthDate() {
		return birthday;
	}

}
