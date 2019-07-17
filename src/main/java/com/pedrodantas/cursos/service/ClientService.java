package com.pedrodantas.cursos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrodantas.cursos.domain.Client;
import com.pedrodantas.cursos.domain.Course;
import com.pedrodantas.cursos.repository.ClientRepository;
import com.pedrodantas.cursos.service.exception.ObjectNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository cp;
	
	
	public List<Client> findAll(){
		return cp.findAll();
	}
	
	public Client insert(Client client) {
		return cp.save(client);
	}
	
	public Client findById(Integer id) {
		Optional<Client> client = cp.findById(id);
		return client.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Client.class.getName()));
	}
	
	public void delete(Integer id) {
		findById(id);
		cp.deleteById(id);
	}
	
	public Client update(Client obj) {
		Client newObj = new Client();
		newObj.setId(obj.getId());
		updateData(newObj, obj);
		return cp.save(newObj);
	}
	
	public void updateData(Client newObj, Client obj) {
		newObj.setCourses(obj.getCourses());
		newObj.setCPF(obj.getCPF());
		newObj.setName(obj.getName());
	}
}
