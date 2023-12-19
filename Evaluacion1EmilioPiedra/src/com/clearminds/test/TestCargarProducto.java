package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestCargarProducto {
    public static void main(String[] args) {
    	 // Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Agregar celda A con stock 0 y sin producto asignado
        maquina.agregarCelda("A");
        

        // Agregar celda B con stock 4 y producto KE34 con precio 0.85
        Producto productoB = new Producto("KE34", 0.85, "BDCR");
        maquina.cargarProductobasic(productoB, "B", 4);

       
        maquina.agregarCelda("B");
        maquina.agregarCelda("C");
        maquina.agregarCelda("D");

        // Agregar celda D con stock 5 y producto BDCR con precio 2.54
        Producto productoD = new Producto("BDCR", 2.54, "D");
        maquina.cargarProductobasic(productoD, "D", 5);

        // Intentar cargar productos en celdas no existentes
        maquina.cargarProductobasic(productoB, "B", 4);
        maquina.cargarProductobasic(productoD, "D", 5);

    
        // Mostrar los productos en la máquina
        maquina.mostrarProductos();
    }
}
