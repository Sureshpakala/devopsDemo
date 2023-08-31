package com.myapp.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsDemo {
	@GetMapping(value="/Demo")
	public String demo() {
		return "This is AWS demo";
	}
}
