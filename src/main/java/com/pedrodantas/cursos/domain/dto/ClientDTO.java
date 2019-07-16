package com.pedrodantas.cursos.domain.dto;

import java.io.Serializable;

import com.pedrodantas.cursos.domain.Client;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String name;
	
	public ClientDTO() {
		
	}
	private ClientDTO(Client client) {
		this.id = client.getId();
		this.name = client.getName();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
