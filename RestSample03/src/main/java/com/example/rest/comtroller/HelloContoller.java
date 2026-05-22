package com.example.rest.comtroller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {

	@GetMapping("/hello-rest")
	public Map<String, Object> helloRest(){
		Map<String, Object> ret = Map.of(
				"message", "HelloRest","section", 3);
		return ret;
	}
	}
