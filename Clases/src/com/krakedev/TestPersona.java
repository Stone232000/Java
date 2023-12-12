package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p; // declaro variable persona con el nombre p
		p = new Persona(); // instancio un ibjeto persona
		Persona p2 = new Persona();
		Persona p3 = new Persona("Pablo");
		Persona p4 = new Persona("Pablo", 18, 1.62);

		System.out.println("nombre " + p4.getNombre());
		System.out.println("edad " + p4.getEdad());
		System.out.println("estatura " + p4.getEstatura());

		// accedo a los atributos
		p.setNombre("juan");
		System.out.println("nombre " + p.getNombre());
		System.out.println("edad " + p.getEdad());
		System.out.println("estatura " + p.getEstatura());

		p2.setNombre("Catalina");
		p2.setEdad(25);
		System.out.println("*-----------*");
		System.out.println("nombre:" + p2.getNombre());
		System.out.println("edad: " + p2.getEdad());
	}

}
