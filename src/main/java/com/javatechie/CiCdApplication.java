package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdApplication {

	@GetMapping("/greetings/{name}")
	public String greetings(@PathVariable String name){
		return "Hello" + name + " congratulations you have completed Jenkins cI/CD";
	}

	public static void main(String[] args) {
		SpringApplication.run(CiCdApplication.class, args);
	}

}
