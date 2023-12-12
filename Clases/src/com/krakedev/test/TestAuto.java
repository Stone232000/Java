package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto = new Auto("Audi",2005,11500);
		Auto auto2 = new Auto("Ferrari",1978,25000);
		auto.setMarca("Audi");
		auto.setAnio(2000);
		auto.setPrecio(115000);
		auto2.setMarca("Ferrari");
		auto2.setAnio(1978);
		auto2.setPrecio(250000);
		System.out.print("Marca: " + auto.getMarca() + "\nAnio: " + auto.getAnio() + "\nPrecio: " + auto.getPrecio());

		System.out.print("\n*********************" + "\nMarca: " + auto2.getMarca() + "\nAnio: " + auto2.getAnio()
				+ "\nPrecio: " + auto2.getPrecio());
	}

}
