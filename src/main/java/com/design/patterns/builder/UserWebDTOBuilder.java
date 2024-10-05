package com.design.patterns.builder;

import java.time.LocalDate;

//The concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {
	private String firstName;
	private String lastName;
	private LocalDate birthday;

	@Override
	public UserDTOBuilder withFirstName(String fname) {
		this.firstName = fname;
		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lname) {
		this.lastName = lname;
		return this;
	}

	@Override
	public UserDTOBuilder withBirthday(LocalDate date) {
		this.birthday = date;
		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		return null;
	}

	@Override
	public UserDTO build() {

		return new UserWebDTO(lastName, firstName, birthday);
	}

	@Override
	public UserDTO getUserDTO() {
		return new UserWebDTO(lastName, firstName, birthday);
	}

}
