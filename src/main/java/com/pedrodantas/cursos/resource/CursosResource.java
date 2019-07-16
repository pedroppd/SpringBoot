package com.pedrodantas.cursos.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pedrodantas.cursos.domain.Course;

@RestController
@RequestMapping(value = "/cursos")
public class CursosResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Course>> findAll() {
		Course c = new Course(1, "JAVA FOR BEGINNERS", "Here u learn how programmer in java ", 200.0);
		List<Course> courses = new ArrayList<>();
		courses.add(c);
		return ResponseEntity.ok().body(courses);
	}

}
