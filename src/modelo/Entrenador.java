package modelo;

import Interface.Actividades;

public class Entrenador extends Persona implements Actividades {

	int grado=0;
	
	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	@Override
	public void dialogar() {

		System.out.println("Ofrece su discurso");
	}

	@Override
	public void concentrarse() {
		
		System.out.println("Para fortalecer al equipo");
	}

	@Override
	public void jugar() {
		
	}

	@Override
	public void entrenar() {
		
	}

	@Override
	public void dirigir() {
		
		System.out.println("Encaminar correctamente a su equipo");
	}

	@Override
	public void viajar() {
		System.out.println("Para los encuentros de su equipo");
	}

	@Override
	public void darMasaje() {
		
	}

		
	
	
}
