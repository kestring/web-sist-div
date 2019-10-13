package br.com.bk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dividas")
public class DividasControllerRest {

	@GetMapping("/get")
	public String imAlive() {
		return "I'm alive!!";
	}
	
}
