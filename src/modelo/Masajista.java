package modelo;

import Interface.Actividades;

public class Masajista extends Persona implements Actividades{

	boolean  cremas=false;
	
	
	public boolean isCremas() {
		return cremas;
	}

	public void setCremas(boolean cremas) {
		this.cremas = cremas;
	}

	@Override
	public void dialogar() {
		System.out.print("indica tratamiento");
		
	}

	@Override
	public void concentrarse() {
	
		System.out.println("Para mantener en forma a los jugadores");
	}

	@Override
	public void jugar() {
		
	}

	@Override
	public void entrenar() {
		
	}

	@Override
	public void dirigir() {
		
	}

	@Override
	public void viajar() {
		
		System.out.println("Segun donde tengan los encuentros el equipo");
		
	}

	@Override
	public void darMasaje() {

		System.out.println("Recuperacion muscular para los jugadores");
		
	}
	
	
}
