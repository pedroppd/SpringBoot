package com.pedrodantas.cursos.resource;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pedrodantas.cursos.domain.State;
import com.pedrodantas.cursos.service.StateService;

@RestController
@RequestMapping("/states")
public class StateResource {

	private StateService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<State>> findAll() {
		List<State> states = service.findAll();
		return ResponseEntity.ok().body(states);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<State> findById(@PathVariable Integer id) {
		State state = service.findById(id);
		return ResponseEntity.ok().body(state);
	}
}
