package com.itsector.bank.app.customer.controller.handler;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class StandardError implements Serializable {
	private static final long serialVersionUID = -6341895024918917872L;
	
	private Long code;
	private String msg;

}
