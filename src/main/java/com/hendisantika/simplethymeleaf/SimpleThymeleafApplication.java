package com.hendisantika.simplethymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController
public class SimpleThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleThymeleafApplication.class, args);
	}

    @GetMapping("/")
    String index() {
        return "Simple Thymeleaf! " + new Date();
    }
}
