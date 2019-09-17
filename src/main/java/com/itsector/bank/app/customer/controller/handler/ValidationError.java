package com.itsector.bank.app.customer.controller.handler;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;
	
	List<FieldMessage> errors = new ArrayList<>();

	public ValidationError(Long code, String msg) {
		super(code, msg);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String fieldName, String msg) {
		this.errors.add(new FieldMessage(fieldName, msg));
	}
}
