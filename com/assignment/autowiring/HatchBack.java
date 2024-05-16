package com.assignment.autowiring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class HatchBack implements ICar{

	@Override
	public List<String> showBrands() {
		
		return Arrays.asList("Maruti Suzuki Baleno", "Tata Altroz", "MINI Cooper");
	}

}
