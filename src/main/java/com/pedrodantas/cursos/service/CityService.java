package com.pedrodantas.cursos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrodantas.cursos.domain.City;
import com.pedrodantas.cursos.repository.CityRepository;
import com.pedrodantas.cursos.service.exception.ObjectNotFoundException;

@Service
public class CityService {
	
	@Autowired
	private CityRepository sr;

	public List<City> findAll() {
		return sr.findAll();
	}

	public City insert(City city) {
		city.setId(null);
		return sr.save(city);
	}

	public City findById(Integer id) {
		Optional<City> city = sr.findById(id);
		return city.orElseThrow(() -> new ObjectNotFoundException("Error, city not found"));
	}

	public void delete(Integer id) {
		findById(id);
		sr.deleteById(id);
	}

	public void update(City obj) {
		City newObj = new City();
		newObj.setId(obj.getId());
		updateData(newObj, obj);
		sr.save(newObj);
	}

	public void updateData(City newObj, City obj) {
		newObj.setName(obj.getName());
		newObj.setCitys(obj.getCitys());
	}
}
