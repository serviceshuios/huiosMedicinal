package com.huios.medical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huios.medical.entities.Praticien;
import com.huios.medical.service.IPraticien;

@RestController
public class PraticienController {
	
	@Autowired
	private IPraticien ipraticien;
	
	@RequestMapping("praticien/index")
	public String Index() {
		return "Index Praticien";
	}
	
	@RequestMapping(value="praticien/praticiens",method=RequestMethod.GET)
	public List<Praticien> findAllPraticiens() {
		return ipraticien.getAllPraticien();
	}
	
	@RequestMapping(value="praticien/praticiens/{id}",method=RequestMethod.GET)
	public Praticien getPraticien(@PathVariable Long id) {
		return ipraticien.getPraticienById(id);
	}
	
	@RequestMapping(value="praticien/praticiens",method=RequestMethod.POST)
	public Praticien savePraticien(@RequestBody Praticien p) {
		return ipraticien.inscription(p);
	}
	
	@RequestMapping(value="praticien/praticiens/{id}",method=RequestMethod.DELETE)
	public Boolean deletePraticien(@PathVariable Long id) {
		ipraticien.delete(id);
		return true;
	}
	
	@RequestMapping(value="praticien/praticiens/{id}",method=RequestMethod.PUT)
	public Praticien getPraticien(@PathVariable Long id, @RequestBody Praticien p) {
		p.setId(id);
		return ipraticien.inscription(p);
	}
	
	@RequestMapping(value="praticien/chercherPraticiens",method=RequestMethod.GET)
	public Page<Praticien> chercherPraticiens(
			@RequestParam(name="mc", defaultValue="") String mc,
			@RequestParam(name="page", defaultValue="0") int page,
			@RequestParam(name="size", defaultValue="5") int size) {
		return ipraticien.chercherPraticien("%"+mc+"%", new PageRequest(page,size));
	}
}
