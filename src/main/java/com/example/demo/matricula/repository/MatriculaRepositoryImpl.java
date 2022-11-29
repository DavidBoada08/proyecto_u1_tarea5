package com.example.demo.matricula.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.modelo.Matricula;

@Repository

public class MatriculaRepositoryImpl implements IMatriculaRepository {

	
	
	

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Matricula crear(String numero) {
		// TODO Auto-generated method stub

		Matricula matricula1 = new Matricula();
		
		matricula1.setAlumnoCod("03155");
		matricula1.setNumero("1245");
		matricula1.setTipo("Ordinaria");
		
		return matricula1;
		
	}

}
