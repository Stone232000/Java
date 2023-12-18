package com.cmc.directorio.entidades;

public class AdminContactos {

	public void buscarMasPesado(Contacto c1,Contacto c2) {
		if(c1.getPeso()>c2.getPeso()) {
			System.out.println("El telefono mas pesado es del contacto 1: "+c1.getPeso());
		}else {
			System.out.println("el telefono mas pesado es del contacto 2: "+c2.getPeso());
		}
		
	}
	
	public void compararOperadoras(Contacto c1,Contacto c2) {
		if(c1.getTef1().getOperadora()==c2.getTef1().getOperadora()) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
	public void activarUsuario(Contacto c1) {
		if (c1.getTef1().isTieneWhatsapp()==true) {
			c1.setActivo(true);
		}else {
			c1.setActivo(false);
		}
		
	}
}
