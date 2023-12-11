package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p; // declaro variable persona con el nombre p
		p = new Persona(); // instancio un ibjeto persona
		Persona p2 = new Persona();

		// accedo a los atributos
		p.nombre = "juan";
		System.out.println("nombre " + p.nombre);
		System.out.println("edad " + p.edad);
		System.out.println("estatura " + p.estatura);

		p2.nombre = "Catalina";
		p2.edad = 25;
		System.out.println("*-----------*");
		System.out.println("nombre:" + p2.nombre);
		System.out.println("edad: " + p2.edad);
	}

}
