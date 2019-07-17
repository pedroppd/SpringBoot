package com.pedrodantas.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedrodantas.cursos.domain.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
