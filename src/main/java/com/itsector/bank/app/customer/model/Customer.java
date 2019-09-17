package com.itsector.bank.app.customer.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "customer")
@Builder
@Setter
@Getter
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Customer
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long profileId;
	private String name;
	private String emailAddress;
	private String streetAddress;
	private String streetAddress2;
	private String streetAddress3;
	private String city;
	private String province;
	private String postalCode;
	private String country;
	private String phoneNumber;
    private Date createTimestamp;
    private Date updateTimestamp;
}
