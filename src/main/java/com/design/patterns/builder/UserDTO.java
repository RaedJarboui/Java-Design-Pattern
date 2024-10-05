package com.design.patterns.builder;

import java.time.LocalDate;

//Interface implemented by "products"
public interface UserDTO {

	String getName();

	String getAddress();

	LocalDate getBirthDate();
}
