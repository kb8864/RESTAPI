package com.example.rest.comtroller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {

	@GetMapping("/hello-rest")
	public Map<String, Object> helloRest(){
		Map<String, Object> ret = Map.of(
				"message", "HelloRest","section", 3);
		return ret;
	}
	
	@PostMapping("/hello-rest")
	public Map<String, Object> helloRestPost(
			@RequestBody HelloRequest request){
		String name = (request.name() != null && !request.name().isBlank())
				? request.name()
                : "名無し";
		
		Map<String, Object> ret = Map.of(
	            "message", "Hello, " + name + "さん！",
	            "section", 3
	            );
		return ret;
		
	}
	record HelloRequest(String name) {}
	}
