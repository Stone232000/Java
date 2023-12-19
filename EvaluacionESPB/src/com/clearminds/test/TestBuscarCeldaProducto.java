package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarCeldaProducto {

	public static void main(String[] args) {
		 // Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Configurar la máquina con los códigos de las celdas
        maquina.configurarMaquina("A1", "A2", "B1", "B2");

        // Cargar un producto de ejemplo en la celda B1
        maquina.cargarProducto("Papitas", 0.85, "KE34", "B1", 5);

        // Buscar y mostrar la celda que contiene el producto con código KE34
        buscarYMostrarCeldaProducto(maquina, "KE34");
    }

    private static void buscarYMostrarCeldaProducto(MaquinaDulces maquina, String codigoProducto) {
        // Buscar la celda que contiene el producto con el código especificado
        String codigoCelda = maquina.buscarCeldaProducto(codigoProducto).getCodigo();

        // Mostrar el resultado en pantalla
        System.out.println("Celda contiene: " + codigoCelda);
    }
		

	}


