package com.pedrodantas.cursos.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrodantas.cursos.domain.Course;
import com.pedrodantas.cursos.service.exception.ObjectNotFoundException;

/*
@Service
public class CourseService {

	@Autowired
	private CourseRepository cp;

	public List<Course> findAll() {
		return cp.findAll();
	}

	public Course insert(Course obj) {
		obj.setId(null);
		return cp.save(obj);
	}

	public Course findById(Integer id) {
		Optional<Course> obj = cp.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Course.class.getName()));
	}

	public void delete(Integer id) {
		cp.deleteById(id);
	}

	public void update(Course obj) {
		Course newObj = new Course();
		newObj.setId(obj.getId());
		updateData(newObj, obj);
		cp.save(newObj);
	}

	public void updateData(Course newObj, Course obj) {
		newObj.setDescription(obj.getDescription());
		newObj.setName(obj.getName());
		newObj.setPrice(obj.getPrice());
		newObj.setClients(obj.getClients());
	}

}
*/