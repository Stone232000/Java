package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		productoA.setNombre("Nastizol");
		productoA.setDescripcion("pastillas para la gripe");
		productoA.setPrecio(5);
		productoA.setStockActual(50);

		productoB.setNombre("Aspirina");
		productoB.setDescripcion("pastillas para el dolor de cabeza");
		productoB.setPrecio(0.50f);
		productoB.setStockActual(150);

		productoC.setNombre("Ibuprofeno");
		productoC.setDescripcion("pastillas para la fiebre");
		productoC.setPrecio(0.25f);
		productoC.setStockActual(250);

		System.out.print("Nombre: " + productoA.getNombre() + "\nDescripcion: " + productoA.getDescripcion() + "\nPrecio: "
				+ productoA.getPrecio() + "\nStock: " + productoA.getStockActual());

		System.out.print("\n*********************" + "\nNombre: " + productoB.getNombre() + "\nDescripcion: "
				+ productoB.getDescripcion() + "\nPrecio: " + productoB.getPrecio() + "\nStock: " + productoB.getStockActual());
		System.out.print("\n*********************" + "\nNombre: " + productoC.getNombre() + "\nDescripcion: "
				+ productoC.getDescripcion() + "\nPrecio: " + productoC.getPrecio() + "\nStock: " + productoC.getStockActual());

	}

}
