package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telef=new Telefono("movi", "0983404312", 001);
		Contacto c=new Contacto("kfc", telef, 250);
		System.out.println(c.getContacto());
		System.out.println(telef.getOperadora()+" "+telef.getNumero()+" "+telef.getCodigo()+" "+telef.isTieneWhatsapp());
		System.out.println(c.getPeso());
		AdminContactos ad=new AdminContactos();
		ad.activarUsuario(c);
		
		}

}
