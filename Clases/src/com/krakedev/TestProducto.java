package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		productoA.nombre = "Nastizol";
		productoA.descripcion = "pastillas para la gripe";
		productoA.precio = 5;
		productoA.stockActual = 50;

		productoB.nombre = "Aspirina";
		productoB.descripcion = "pastillas para el dolor de cabeza";
		productoB.precio = 0.50f;
		productoB.stockActual = 150;

		productoC.nombre = "Ibuprofeno";
		productoC.descripcion = "pastillas para la fiebre";
		productoC.precio = 0.25f;
		productoC.stockActual = 250;

		System.out.print("Nombre: " + productoA.nombre + "\nDescripcion: " + productoA.descripcion + "\nPrecio: "
				+ productoA.precio + "\nStock: " + productoA.stockActual);

		System.out.print("\n*********************" + "\nNombre: " + productoB.nombre + "\nDescripcion: "
				+ productoB.descripcion + "\nPrecio: " + productoB.precio + "\nStock: " + productoB.stockActual);
		System.out.print("\n*********************" + "\nNombre: " + productoC.nombre + "\nDescripcion: "
				+ productoC.descripcion + "\nPrecio: " + productoC.precio + "\nStock: " + productoC.stockActual);

	}

}
