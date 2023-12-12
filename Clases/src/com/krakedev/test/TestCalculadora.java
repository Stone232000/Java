package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {
	int x = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultadosum;
		int resultadores;
		double resultadomul;
		double resultadodiv;
		double resultadoprom;
		Calculadora c1 = new Calculadora();
		resultadosum = c1.Sumar(5, 5);
		resultadores = c1.Restar(10, 5);
		resultadomul = c1.multiplicar(2.0, 3.0);
		resultadodiv = c1.dividir(10, 5);
		resultadoprom = c1.promediar(15, 10, 10);
		System.out.println(resultadosum);
		System.out.println(resultadores);
		System.out.println(resultadomul);
		System.out.println(resultadodiv);
		System.out.println(resultadoprom);
		c1.mostrarResultados();

	}

}
