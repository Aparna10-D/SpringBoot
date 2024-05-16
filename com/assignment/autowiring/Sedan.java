package com.assignment.autowiring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Sedan implements ICar{

	@Override
	public List<String> showBrands() {
		
		return Arrays.asList("Skoda Slavia", "Hyundai Verna", "Honda City");
	}

}
