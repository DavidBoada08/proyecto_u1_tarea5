package com.example.demo.herencia;

public class NinioH extends AlumnoH {
	
	private String horario;
	
	public Integer carcularDescuento() {

		System.out.println("Alumno Niño beca del con el 20% de descuento");
		return 20;
	}
	

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Ninia [horario=" + horario + "]";
	}
	
	

}
