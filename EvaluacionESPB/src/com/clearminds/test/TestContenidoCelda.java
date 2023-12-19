package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class TestContenidoCelda {

	public static void main(String[] args) {
		// Crear una instancia de Producto
        Producto producto = new Producto("Papitas", 0.85, "KE34");

        // Crear una instancia de Celda y asignar un producto con stock
        Celda celda = new Celda("A1");
        celda.ingresarProducto(producto, 5);

        // Imprimir el resultado esperado
        System.out.println("CELDA: " + celda.getCodigo());
        System.out.println("***********");
        System.out.println("Nombre producto: " + celda.getProducto().getNombre());
        System.out.println("Precio producto: " + celda.getProducto().getPrecio());
        System.out.println("Codigo producto: " + celda.getProducto().getCodigo());
        System.out.println("Stock: " + celda.getStock());

	}

}
