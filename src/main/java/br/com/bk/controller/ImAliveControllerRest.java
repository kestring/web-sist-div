package br.com.bk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/div")
public class ImAliveControllerRest {

	@GetMapping("/get")
	public String imAlive() {
		return "I'm alive!!";
	}
	
}
