package com.huios.medical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huios.medical.service.IPayeur;

@RestController
public class PayeurController {

	@Autowired
	private IPayeur iPayeur;
	
	@RequestMapping("payeur/index")
	public String Index() {
		return "Index Payeur";
	}
}
