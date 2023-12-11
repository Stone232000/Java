package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		int area1;
		int area2;
		double per1;
		double per2;
		r1.altura = 5;
		r1.base = 10;
		r2.base = 8;
		r2.altura = 3;
		area1 = r1.calcularArea();
		area2 = r2.calcularArea();
		per1=r1.calcularPerimetro();
		per2=r2.calcularPerimetro();
		System.out.println("area de r1: " + area1);
		System.out.println("area de r2: " + area2);
		System.out.println("perimetro de r1: " + per1);
		System.out.println("perimetro de r2: " + per2);

	}

}
