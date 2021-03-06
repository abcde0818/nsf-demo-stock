package com.netease.cloud.nsf.demo.controller;

import com.netease.cloud.nsf.demo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {

	@Autowired
	StockService randomService;
	
	@GetMapping("/number")
	public int getNumber() {
		
		return randomService.getRandomNumber();
	}
	
	@GetMapping("/string")
	public String getString() {
		
		return randomService.getRanomString();
	}
}
