package com.itsector.bank.app.customer.dto;

import org.modelmapper.ModelMapper;

public class BaseDTO {

	public <T> T of(Class<T> clazz) {
		return new ModelMapper().map(this, clazz);
	}
}
