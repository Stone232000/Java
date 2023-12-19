package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;
import com.clearminds.componentes.Producto;

public class TestMenores {

    public static void main(String[] args) {
        // Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Agregar 6 celdas, cada una con un producto diferente
        maquina.agregarCelda("A1");
        maquina.agregarCelda("A2");
        maquina.agregarCelda("B1");
        maquina.agregarCelda("B2");
        maquina.agregarCelda("C1");
        maquina.agregarCelda("C2");

        // Cargar productos en cada celda
        maquina.cargarProductobasic(new Producto("Chocolate", 1.50, "CH01"), "A1", 5);
        maquina.cargarProductobasic(new Producto("Galletas", 1.20, "GA02"), "A2", 3);
        maquina.cargarProductobasic(new Producto("Chicles", 0.75, "CHL03"), "B1", 8);
        maquina.cargarProductobasic(new Producto("Caramelos", 0.50, "CAR04"), "B2", 10);
        maquina.cargarProductobasic(new Producto("Paletas", 2.00, "PAL05"), "C1", 4);
        maquina.cargarProductobasic(new Producto("Papitas", 0.90, "PAP06"), "C2", 6);

        // Definir un límite de precio
        double limitePrecio = 1.0;

        // Probar el método buscarMenores
        System.out.println("Productos con precio menor o igual a " + limitePrecio + ":");
        maquina.buscarMenores(limitePrecio).forEach(producto -> {
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
        });
    }
}
