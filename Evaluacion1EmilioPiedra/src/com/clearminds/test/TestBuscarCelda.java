package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;
import com.clearminds.componentes.Celda;

public class TestBuscarCelda {

	public static void main(String[] args) {
		   // Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Agregar celdas A1, A2, B1, B2 a la máquina
        maquina.agregarCelda("A");
        maquina.agregarCelda("B");
        maquina.agregarCelda("C");
        maquina.agregarCelda("D");

        // Realizar la búsqueda de celdas
        buscarYMostrarResultado(maquina, "C");
        buscarYMostrarResultado(maquina, "A2");
    }

    // Método auxiliar para buscar y mostrar el resultado
    public static void buscarYMostrarResultado(MaquinaDulces maquina, String codigoCelda) {
        Celda celdaEncontrada = maquina.buscarCelda(codigoCelda);
        if (celdaEncontrada != null) {
            System.out.println("Celda encontrada: " + celdaEncontrada.getCodigo());
        } else {
            System.out.println("No existe la celda buscada: " + codigoCelda);
        }	

	}

}
