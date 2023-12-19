package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;

public class TestMaquinaDulces {

    public static void main(String[] args) {
        // Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        
        maquina.agregarCelda("A");
        maquina.agregarCelda("B");
        maquina.agregarCelda("C");
        maquina.agregarCelda("D");

        // Mostrar la configuración actual de la máquina
        mostrarConfiguracion(maquina);
    }

    // Método auxiliar para mostrar la configuración de la máquina
    public static void mostrarConfiguracion(MaquinaDulces maquina) {
        System.out.println("Configuración actual de la máquina:");
        int numeroCelda = 1;
        for (var celda : maquina.getCeldas()) {
            System.out.println("Celda " + numeroCelda + ": " + celda.getCodigo());
            numeroCelda++;
        }
    }
}
