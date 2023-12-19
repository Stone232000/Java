package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;

public class TestConfiguracion {

	public static void main(String[] args) {
		  // Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Configurar la máquina con los códigos de las celdas
        maquina.configurarMaquina("A1", "A2", "B1", "B2");

        // Mostrar la configuración actual de la máquina
        System.out.println("Celda 1: " + maquina.getCelda1().getCodigo());
        System.out.println("Celda 2: " + maquina.getCelda2().getCodigo());
        System.out.println("Celda 3: " + maquina.getCelda3().getCodigo());
        System.out.println("Celda 4: " + maquina.getCelda4().getCodigo());
	}

}
