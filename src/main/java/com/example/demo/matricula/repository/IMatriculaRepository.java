package com.example.demo.matricula.repository;

import com.example.demo.matricula.modelo.Matricula;

public interface IMatriculaRepository {
	

	
	public Matricula crear(String numero);
	public void actualizar(Matricula matricula); 
	public void insertar(Matricula matricula);
	public void borrar(Integer id);

}
