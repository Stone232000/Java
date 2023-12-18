package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf1=new Telefono("movi","09941234123",10);
		Telefono telf2=new Telefono("movi","09941234123",10);
		Telefono telf3=new Telefono("claro","09941234123",10);
		Telefono telf4=new Telefono("movi","09941234123",10);
		
		AdminTelefono e=new AdminTelefono();
		e.contarMovi(telf1, telf2, telf3);
		e.contarClaro(telf1, telf2, telf3, telf4);
		
		
		
	}

}
