package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarCeldaProducto {

	public static void main(String[] args) {

	        // Crear una instancia de MaquinaDulces
	        MaquinaDulces maquina = new MaquinaDulces();

	        // Agregar celda D con stock 5
	        maquina.agregarCelda("D");
	        maquina.cargarProductobasic(null, "D", 5); // Se carga un producto ficticio con cantidad 5

	        // Mostrar la configuración actual de la máquina
	        maquina.mostrarConfiguracion();
	        maquina.mostrarProductos();

	}

}
