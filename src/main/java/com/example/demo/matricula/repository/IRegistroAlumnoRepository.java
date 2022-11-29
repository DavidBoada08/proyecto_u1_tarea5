package com.example.demo.matricula.repository;

import com.example.demo.matricula.modelo.Matricula;

public interface IRegistroAlumnoRepository {
	
	
	public void crear(Matricula matricula);
	public void actualizar(Matricula matricula); 
	public void insertar(Matricula matricula);
	public void borrar(Integer id);


}
