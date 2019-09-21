package com.itsector.bank.app.customer.dto.in;



import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;


import com.itsector.bank.app.customer.dto.BaseDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter @Setter
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class CustomerIn extends BaseDTO
{
	@Id
    private Long profileId;
	@NotEmpty(message = "Required.")
	@Length(min = 5, max = 50, message = "Length must be between 5 and 20 characters.")
	private String name;
	@NotEmpty(message = "Required.")
	@Length(min = 5, max = 75, message = "Length must be between 5 and 75 characters.")
	private String emailAddress;
	@NotEmpty(message = "Required.")
	//@Length(min = 5, max = 75, message = "Length must be between 5 and 75 characters.")//codigo original
	@Length(min = 5, max = 50, message = "Length must be between 5 and 50 characters.")//foi alterado o tamanho maximo do campo streetAddress[FabioLobo]
	private String streetAddress;
	@Length(min = 5, max = 75, message = "Length must be between 5 and 75 characters.")
	private String streetAddress2;
	@Length(min = 5, max = 75, message = "Length must be between 5 and 75 characters.")
	private String streetAddress3;
	@NotEmpty(message = "Required.")
	@Length(min = 5, max = 75, message = "Length must be between 5 and 75 characters.")
	private String city;
	@NotEmpty(message = "Required.")
	@Length(min = 2, max = 5, message = "Length must be between 2 and 5 characters.")
	private String province;
	@NotEmpty(message = "Required.")
	@Pattern(regexp="\\d{4}-\\d{3}", message = "Invalid postal code format. Valid Format: \\d{4}-\\d{3}")
	@Length(min = 5, max = 20, message = "Length must be between 5 and 20 characters.")
	private String postalCode;
	@NotEmpty(message = "Required.")
	@Length(min = 2, max = 2, message = "Length must be 2 characters.")
	private String country;
	private String phoneNumber;


}
