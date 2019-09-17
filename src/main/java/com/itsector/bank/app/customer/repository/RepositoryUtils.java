package com.itsector.bank.app.customer.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class RepositoryUtils {
	
	private RepositoryUtils() {}
	
	public static <T> List<T> toList(Iterable<T> itr) {
		return StreamSupport.stream(itr.spliterator(), false) 
	            .collect(Collectors.toList()); 
	}

}

