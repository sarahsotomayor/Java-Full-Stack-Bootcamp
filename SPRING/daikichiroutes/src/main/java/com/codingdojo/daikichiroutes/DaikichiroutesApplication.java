package com.codingdojo.daikichiroutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

//@Restcontroller annotation

@RestController
public class DaikichiroutesApplication {
	public static void main(String[] args) {
		SpringApplication.run(DaikichiroutesApplication.class, args);
	}
	
//@Requestmapping annotation
	
	@RequestMapping("/")
	  public String hello() {
        return "Hello World!";
      }
	
	@RequestMapping("/daikichi")
	  public String welcome() {
      return "Welcome!";
    }
	
	@RequestMapping("/daikichi/today")
	  public String today() {
      return "Today you will find luck in all your endeavors!";
    }
	
	@RequestMapping("/daikichi/tomorrow")
	  public String tomorrow() {
    return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
  }

}
