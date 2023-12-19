package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;

public class TestConsultarPrecio {

	public static void main(String[] args) {
		// Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Configurar la máquina con los códigos de las celdas
        maquina.configurarMaquina("A1", "A2", "B1", "B2");

        // Cargar un producto de ejemplo en la celda B1
        maquina.cargarProducto("Papitas", 0.85, "KE34", "B1", 5);

        // Consultar y mostrar el precio del producto en la celda B1
        consultarYMostrarPrecio(maquina, "B1");
    }

    private static void consultarYMostrarPrecio(MaquinaDulces maquina, String codigoCelda) {
        // Consultar el precio del producto en la celda especificada
        double precioProducto = maquina.consultarPrecio(codigoCelda);

        // Mostrar el resultado en pantalla
        System.out.println("Precio en " + codigoCelda + ": " + precioProducto);	

	}

}
