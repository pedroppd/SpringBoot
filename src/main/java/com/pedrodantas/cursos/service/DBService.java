package com.pedrodantas.cursos.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrodantas.cursos.domain.Client;
import com.pedrodantas.cursos.domain.Course;
import com.pedrodantas.cursos.repository.ClientRepository;
import com.pedrodantas.cursos.repository.CourseRepository;

@Service
public class DBService {

	@Autowired
	private ClientRepository clientRepositoy;

	@Autowired
	private CourseRepository courseRepository;

	public void instantiateDataBase() {
		
		Course course1 = new Course(null, "Java Script", "Aprenda as melhores técnicas", 300.00);
		Course course2 = new Course(null, "PHP", "Alcance seus espaço no mercado de trabalho.", 150.00);
		Course course3 = new Course(null, "C#", "Venha aprender C# conosco", 400.00);
			
		courseRepository.saveAll(Arrays.asList(course1, course2, course3));
		
		Client client1 = new Client(null, "Joao santos", "12516453728");
		Client client2 = new Client(null, "Gabriela madureira", "12212653728");
		Client client3 = new Client(null, "Márcio dos anjos", "53615612528");
		
		clientRepositoy.saveAll(Arrays.asList(client1, client2, client3));
		
		course1.getClients().addAll(Arrays.asList(client1));
		course2.getClients().addAll(Arrays.asList(client2));
		course3.getClients().addAll(Arrays.asList(client3));
		
		client1.getCourses().addAll(Arrays.asList(course1));
		client2.getCourses().addAll(Arrays.asList(course2));
		client3.getCourses().addAll(Arrays.asList(course3));
		
		
		
	
		
		
		
		

		
		
		
		
	}
}
