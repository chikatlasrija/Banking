package com.example.BankingApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
@RequestMapping("/home")
    public String home() {
	return "HELLO WELCOME TO SBI BANK";
}
@RequestMapping("/contact")
    public String contact()
    {
	return "Welcome to SBI contact";
    }
@RequestMapping("/about")
     public String about()
     {
	return "Welcome to about";
}
@RequestMapping("/balance")
      public String balance()
      {
	return "Welcome to SBI balance";
      }
}
