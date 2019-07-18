package com.pedrodantas.cursos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pedrodantas.cursos.domain.City;
import com.pedrodantas.cursos.service.CityService;

@RestController
@RequestMapping("/citys")
public class CityResource {

	@Autowired
	private CityService service;

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<City>> findAll() {
		List<City> citys = service.findAll();
		return ResponseEntity.ok().body(citys);
	}
	
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public ResponseEntity<City> findById(@PathVariable Integer id){
		City city = service.findById(id);
		return ResponseEntity.ok().body(city);
	}
}
