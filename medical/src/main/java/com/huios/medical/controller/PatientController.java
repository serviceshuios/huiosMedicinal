package com.huios.medical.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

	@RequestMapping("patient/index")
	public String Index() {
		return "Index Patient";
	}
}