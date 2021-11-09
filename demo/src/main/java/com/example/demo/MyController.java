package com.example.demo;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/")
	public String welcome() {
		return "This is my first Rest Controller";
	}

	@GetMapping(value = { "/api/defaultemployeeswithoptional", "/api/defaultemployeeswithoptional/{shah}" })
	@ResponseBody
	public String getDefaultEmployeesByIdWithOptional(@PathVariable Optional<String> id) {
		if (id.isPresent()) {
			return "ID: " + id.get();
		} else {
			return "ID: Default Employee";
		}
	}
}
