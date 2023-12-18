package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validador validador=new Validador();
		validador.validadorEdad(10);
		validador.validadorEdad(20);
		validador.validadorEdad(18);
		validador.validadorEdad(16);
		validador.validadorEdad(-3);
		

	}

}
