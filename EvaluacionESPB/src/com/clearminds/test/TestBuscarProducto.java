package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProducto {

    public static void main(String[] args) {
    	// Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Configurar la máquina con los códigos de las celdas
        maquina.configurarMaquina("A1", "A2", "B1", "B2");

        // Cargar un producto de ejemplo en la celda B1
        maquina.cargarProducto("Papitas", 0.85, "KE34", "B1", 5);
        maquina.cargarProducto("chocolate", 50, "11", null, 0);

        // Buscar y mostrar el nombre del producto en la celda B1
        buscarYMostrarNombreProducto(maquina, "KE34");
        buscarYMostrarNombreProducto(maquina, "11");
    }

    private static void buscarYMostrarNombreProducto(MaquinaDulces maquina, String codigoProducto) {
        // Buscar y mostrar el nombre del producto
        String nombreProductoEncontrado = maquina.obtenerNombreProducto(codigoProducto);

        // Mostrar el resultado en pantalla
        System.out.println("Producto Encontrado: " + nombreProductoEncontrado);
    }
}
