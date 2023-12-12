package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		double area1;
		double area2;
		double area3;
		double per1;
		double per2;
		double per3;
		c1.setLado(3);
		c2.setLado(4);
		c3.setLado(5);
		area1 = c1.calcularArea();
		per1 = c1.calcularPerimetro();
		area2 = c2.calcularArea();
		per2 = c2.calcularPerimetro();
		area3 = c3.calcularArea();
		per3 = c3.calcularPerimetro();
		System.out.println("area del cuadrado 1: " + area1);
		System.out.println("perimetro del cuadrado 1: " + per1);
		System.out.println("*************************");
		System.out.println("area del cuadrado 2: " + area2);
		System.out.println("perimetro del cuadrado 2: " + per2);
		System.out.println("*************************");
		System.out.println("area del cuadrado 3: " + area3);
		System.out.println("perimetro del cuadrado 3: " + per3);
	}

}
