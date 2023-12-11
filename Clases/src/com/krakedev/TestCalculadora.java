package com.krakedev;

public class TestCalculadora {
int x=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultadosum;
		int resultadores;
		Calculadora c1=new Calculadora();
		 resultadosum=c1.Sumar(5, 5);
		 resultadores=c1.Restar(10, 5);
		 System.out.println(resultadosum);
		System.out.println(resultadores);
		TestCalculadora myObj=new TestCalculadora();
		System.out.println(myObj.x);

	}

}
