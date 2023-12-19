package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {

	public static void main(String[] args) {
		  // Crear una instancia de Celda
        Celda celda = new Celda("A1");

        // Intentar acceder a un producto que no ha sido inicializado
        try {
            String nombreProducto = celda.getProducto().getNombre();
            System.out.println("Nombre del producto: " + nombreProducto);
        } catch (NullPointerException e) {
            System.out.println("Se ha producido un NullPointerException: " + e.getMessage());
        }

	}

}
//el atributo que causa este error Es producto linea 13.  