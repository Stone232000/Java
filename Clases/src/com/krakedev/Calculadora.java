package com.krakedev;

public class Calculadora {
	public int Sumar(int a, int b) {
		int resultado;
		resultado = a + b;
		return resultado;

	}

	public int Restar(int a, int b) {
		int resultado;
		resultado = a - b;
		return resultado;

	}

	public double multiplicar(double valor1, double valor2) {
		double resultado;
		resultado = valor1 * valor2;
		return resultado;

	}

	public double dividir(double valor1, double valor2) {
		double resultado;
		resultado = valor1 / valor2;
		return resultado;

	}

	public double promediar(double valor1, double valor2, double valor3) {
		double resultado;
		resultado = ((valor1 + valor2 + valor3) / 3);
		return resultado;

	}

	public void mostrarResultados() {
		System.out.println("Ahorita no joven, Sali al almuerzo. Regreso en 15 minutos");
	}
}
