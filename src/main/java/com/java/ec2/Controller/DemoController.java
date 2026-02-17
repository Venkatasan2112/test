package com.java.ec2.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

	@GetMapping("/demo")
	public ResponseEntity<String> demoController() {
		return ResponseEntity.ok("AWS EC2 working successfully !");
	}

}
