package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Telefono telef=new Telefono("movi", "0983404312", 001);
			Contacto c=new Contacto("kfc", telef, 250);
			
			System.out.println("Su contacto es: "+c.getContacto());
			System.out.println("Su telefono es: "+telef.getOperadora()+" "+telef.getNumero());
			System.out.println("Su peso es: "+c.getPeso());
			
			Telefono tele1=new Telefono("movi","0999859161",050);
			Telefono tele2=new Telefono("movi","0999859161",051);
			
			Contacto cont1=new Contacto("mcdonalds",tele1,500);
			Contacto cont2=new Contacto("burger king",tele2,800);
			AdminContactos c1=new AdminContactos();
			System.out.println("***************");
			c1.buscarMasPesado(cont1, cont2);
			if(cont1.getPeso()>cont2.getPeso()) {
				System.out.println("Su contacto es: "+cont1.getContacto());
				System.out.println("Su telefono es: "+tele1.getOperadora()+" "+tele1.getNumero());
				System.out.println("Su peso es: "+cont1.getPeso());
			}else {
				System.out.println("Su contacto es: "+cont2.getContacto());
				System.out.println("Su telefono es: "+tele2.getOperadora()+" "+tele2.getNumero());
				System.out.println("Su peso es: "+cont2.getPeso());
			}
			System.out.println("*************");
			c1.compararOperadoras(cont1, cont2);
	}
	

}
