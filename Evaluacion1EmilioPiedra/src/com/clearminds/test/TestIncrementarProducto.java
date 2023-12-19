package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestIncrementarProducto {

    public static void main(String[] args) {
        // Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Configurar la máquina con los códigos de las celdas A, B, C y D
        maquina.agregarCelda("A");
        maquina.agregarCelda("B");
        maquina.agregarCelda("C");
        maquina.agregarCelda("D");

        // Cargar productos de ejemplo en las celdas A, B y D

        Producto papitas = new Producto("Papitas", 0.85, "CH001");
        Producto gatorade = new Producto("Gatorade", 2.54, null);

        maquina.cargarProductobasic(papitas, "B", 5);
        maquina.cargarProducto(gatorade, "D", 5);

        // Mostrar la información antes del incremento
        System.out.println("********Antes del Incremento*********");
        mostrarInformacionDespuesIncremento(maquina);

        // Incrementar el stock de productos en las celdas A y B
        maquina.incrementarProductos("KE34", 1);
        maquina.incrementarProductos("CH001", 5);

        // Mostrar la información después del incremento
        System.out.println("\n********Después del Incremento*********");
        mostrarInformacionDespuesIncremento(maquina);
    }

    private static void mostrarInformacionDespuesIncremento(MaquinaDulces maquina) {
        // Mostrar información de todas las celdas
        System.out.println("******Información de las Celdas*****");
        for (char celdaCodigo = 'A'; celdaCodigo <= 'D'; celdaCodigo++) {
            String codigoCelda = String.valueOf(celdaCodigo);
            System.out.println("******Celda " + codigoCelda + "*****");
            mostrarInformacionCelda(maquina.buscarCelda(codigoCelda));
        }
        System.out.println("************************************\n");
    }

    private static void mostrarInformacionCelda(com.clearminds.componentes.Celda celda) {
        if (celda != null) {
            System.out.println("Stock: " + celda.getStock());
            com.clearminds.componentes.Producto producto = celda.getProducto();
            if (producto != null) {
                System.out.println("Nombre Producto: " + producto.getNombre());
                System.out.println("Precio Producto: " + producto.getPrecio());
                // No mostrar el código del producto
            } else {
                System.out.println("La celda no tiene producto!!");
            }
            System.out.println("***********\n");
        }
    }
}
