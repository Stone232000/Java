package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto = new Auto();
		Auto auto2 = new Auto();
		auto.marca = "Audi";
		auto.anio = 2000;
		auto.precio = 115000;
		auto2.marca = "Ferrari";
		auto2.anio = 1978;
		auto2.precio = 250000;
		System.out.print("Marca: " + auto.marca + "\nAnio: " + auto.anio + "\nPrecio: " + auto.precio);

		System.out.print("\n*********************" + "\nMarca: " + auto2.marca + "\nAnio: " + auto2.anio + "\nPrecio: "
				+ auto2.precio);
	}

}
