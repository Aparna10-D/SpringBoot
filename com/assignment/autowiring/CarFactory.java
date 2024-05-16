package com.assignment.autowiring;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class CarFactory {
	@Autowired
    @Qualifier("hatchBack")
	ICar car;
	
	public List<String> checkBrands(){
		System.out.println("Displaying brands..");
		return car.showBrands();
	}
}
