package com.pedrodantas.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedrodantas.cursos.domain.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
