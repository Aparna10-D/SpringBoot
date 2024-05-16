package com.assignment.autowiring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Convertible implements ICar{

	@Override
	public List<String> showBrands() {
		
		return Arrays.asList("Porsche 911", "BMW Z4", "Ferrari 812");
	}
 
}
