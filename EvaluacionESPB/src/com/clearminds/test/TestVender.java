package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class TestVender {

    public static void main(String[] args) {
        // Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Configurar la máquina con los códigos de las celdas
        maquina.configurarMaquina("A1", "A2", "B1", "B2");

        // Cargar productos de ejemplo en las celdas
        cargarProductosEjemplo(maquina);

        // Realizar una venta en la celda A1
        maquina.vender("A1");

        // Realizar una venta con cambio en la celda B1
        double cambio = maquina.venderConCambio("B1", 2.0);

        // Mostrar la información después de las ventas
        mostrarInformacionDespuesVentas(maquina, cambio);
    }

    private static void cargarProductosEjemplo(MaquinaDulces maquina) {
        // Crear productos de ejemplo
        Producto doritos = new Producto("Doritos", 0.70, "DA56");
        Producto papitas = new Producto("Papitas", 0.85, "KE34");

        // Cargar productos en las celdas
        maquina.cargarProductobasic(doritos, "A1", 5);
        maquina.cargarProductobasic(papitas, "B1", 3);
    }

    private static void mostrarInformacionDespuesVentas(MaquinaDulces maquina, double cambio) {
    	
        System.out.println("************************");
        System.out.println("*********CELDA A1******");
        mostrarInformacionCelda(maquina.getCelda1());
        System.out.println("******Celda A2*****");
        mostrarInformacionCelda(maquina.getCelda2());
        System.out.println("******Celda B1*****");
        mostrarInformacionCelda(maquina.getCelda3());
        System.out.println("******Celda B2*****");
        mostrarInformacionCelda(maquina.getCelda4());
        System.out.println("Saldo: " + (maquina.getSaldo()));
    }

    private static void mostrarInformacionCelda(Celda celda) {
        if (celda != null) {
            System.out.println("Stock: " + celda.getStock());
            Producto producto = celda.getProducto();
            if (producto != null) {
                System.out.println("Nombre Producto: " + producto.getNombre());
                System.out.println("Precio Producto: " + producto.getPrecio());
                System.out.println("Codigo Producto: " + producto.getCodigo());
            } else {
                System.out.println("La celda no tiene producto!!");
                
            }
        }
        
    }
}
