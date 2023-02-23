
	package com.example.demo.controller;

	import org.springframework.beans.factory.annotation.Value;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class Controller {
		@Value("${value:KAMALESH}")
		private String name;
		
		@GetMapping("/")
		public String welcome() {
			return "Welcome "+ name;
		}
		
	}

