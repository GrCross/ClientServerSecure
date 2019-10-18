package main.java.com.nt.ms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/server")
public class ServerController {
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public String getData() {
		System.out.println("Returning data from server data method");
		return "Hello from server-data method";
	}
}