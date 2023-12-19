package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.maquina.MaquinaDulces;

public class TestBusqueda {

	public static void main(String[] args) {
		   // Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Configurar la máquina con los códigos de las celdas
        maquina.configurarMaquina("A1", "A2", "B1", "B2");

        // Buscar la celda con el código "A2"
        Celda celdaEncontrada = maquina.buscarCelda("A2");

        // Mostrar el resultado de la búsqueda
        if (celdaEncontrada != null) {
            System.out.println("Celda Encontrada: " + celdaEncontrada.getCodigo());
        } else {
            System.out.println("No existe la celda");
        }

        // Buscar una celda 
        Celda celdaNoEncontrada = maquina.buscarCelda("C3");

        // Mostrar el resultado de la búsqueda
        //
        if (celdaNoEncontrada != null) {
            System.out.println("Celda Encontrada: " + celdaNoEncontrada.getCodigo());
        } else {
            System.out.println("No existe la celda");
        }

	}

}
