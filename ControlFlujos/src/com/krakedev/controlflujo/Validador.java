package com.krakedev.controlflujo;

public class Validador {
	public void validadorEdad(int edad) {
		if (edad >= 18) {
			System.out.println("Es mayor de edad");
		} else if (edad >= 12 && edad < 18) {

			System.out.println("es adolescente");
		} else if (edad > 0 && edad < 12) {
			System.out.println("Es niño");
		} else {
			System.out.println("Es incorrecto");
		}
	}

}
