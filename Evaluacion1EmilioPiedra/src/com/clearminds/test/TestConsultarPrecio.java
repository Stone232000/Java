package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestConsultarPrecio {
    public static void main(String[] args) {
        // Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Agregar celda D con stock 5 y cargar el producto "Papitas" en ella
        maquina.agregarCelda("D");

        // Crear un objeto Producto con nombre "Papitas"
        Producto papitas = new Producto("Papitas", 2.54, null);

        // Cargar el producto en la celda D con stock 5
        maquina.cargarProducto(papitas, "D", 5);

        // Consultar y mostrar solo el precio del producto en la celda D
        try {
            double precioPapitasD = maquina.consultarPrecio("D");
            System.out.println("Precio de Papitas en la celda D: " + precioPapitasD);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
