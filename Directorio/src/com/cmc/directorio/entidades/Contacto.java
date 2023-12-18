package com.cmc.directorio.entidades;

public class Contacto {
	private String contacto;
	private boolean activo;
	private Telefono tef1;
	private double peso;
	public Contacto(String contacto, Telefono tef1, double peso) {
		super();
		this.contacto = contacto;
		this.tef1 = tef1;
		this.peso = peso;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public Telefono getTef1() {
		return tef1;
	}
	public void setTef1(Telefono tef1) {
		this.tef1 = tef1;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
