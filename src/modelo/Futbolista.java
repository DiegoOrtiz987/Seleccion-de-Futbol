package modelo;

import Interface.Actividades;

public class Futbolista extends Persona implements Actividades{
	
	String posicion="";
	boolean estado= false;
	int numero=0;
	
	
	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

	@Override
	public void dialogar(){
	
		System.out.println("Expone sus motivos");
	}
	
	@Override
	public void concentrarse(){
		System.out.println("Para rendir en el partido");
	}
	
	@Override
	public void jugar(){
		
		System.out.println("cada partido que este convocado");
	}

	@Override
	public void entrenar() {
		
		System.out.println("fortalecer sus habilidades");
		
	}

	@Override
	public void dirigir() {
	}

	@Override
	public void viajar() {
	
		System.out.println("Para los encuentros");
		
	}

	@Override
	public void darMasaje() {
		
	}
	
}
