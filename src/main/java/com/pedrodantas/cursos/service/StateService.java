package com.pedrodantas.cursos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrodantas.cursos.domain.State;
import com.pedrodantas.cursos.repository.StateRepository;
import com.pedrodantas.cursos.service.exception.ObjectNotFoundException;

@Service
public class StateService {

	@Autowired
	private StateRepository sr;

	public List<State> findAll() {
		return sr.findAll();
	}

	public State insert(State state) {
		state.setId(null);
		return sr.save(state);
	}

	public State findById(Integer id) {
		Optional<State> state = sr.findById(id);
		return state.orElseThrow(() -> new ObjectNotFoundException("Error, state not found"));
	}

	public void delete(Integer id) {
		findById(id);
		sr.deleteById(id);
	}
	
	public void update(State obj) {
		State newObj = new State();
		newObj.setId(obj.getId());
		updateData(newObj, obj);
		sr.save(newObj);
	}

	public void updateData(State newObj, State obj) {
		newObj.setName(obj.getName());
		newObj.setCitys(obj.getCitys());
	}
}
