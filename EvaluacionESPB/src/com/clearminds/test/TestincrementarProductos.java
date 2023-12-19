package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;

public class TestincrementarProductos {

	public static void main(String[] args) {
		 // Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Configurar la máquina con los códigos de las celdas
        maquina.configurarMaquina("A1", "A2", "B1", "B2");

        // Cargar un producto de ejemplo en la celda B1
        maquina.cargarProducto("Papitas", 0.85, "KE34", "B1", 5);

        // Incrementar el stock del producto en la celda B1
        maquina.incrementarProductos("KE34", 7);

        // Mostrar la información después del incremento
        mostrarInformacionDespuesIncremento(maquina);
    }

    private static void mostrarInformacionDespuesIncremento(MaquinaDulces maquina) {
        System.out.println("********Luego del Incremento*********");

        // Mostrar información de la Celda A1
        System.out.println("******Celda A1*****");
        mostrarInformacionCelda(maquina.getCelda1());

        // Mostrar información de la Celda A2
        System.out.println("******Celda A2*****");
        mostrarInformacionCelda(maquina.getCelda2());

        // Mostrar información de la Celda B1
        System.out.println("******Celda B1*****");
        mostrarInformacionCelda(maquina.getCelda3());

        // Mostrar información de la Celda B2
        System.out.println("******Celda B2*****");
        mostrarInformacionCelda(maquina.getCelda4());
    }

    private static void mostrarInformacionCelda(com.clearminds.componentes.Celda celda) {
        if (celda != null) {
            System.out.println("Stock: " + celda.getStock());
            com.clearminds.componentes.Producto producto = celda.getProducto();
            if (producto != null) {
                System.out.println("Nombre Producto: " + producto.getNombre());
                System.out.println("Precio Producto: " + producto.getPrecio());
                System.out.println("Codigo Producto: " + producto.getCodigo());
                
            } else {
                System.out.println("La celda no tiene producto!!");
                System.out.println("***********");
            }
        }
       

	}

}
