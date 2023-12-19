package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class TestVenderConCambio {

    public static void main(String[] args) {
        // Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Configurar la máquina con los códigos de las celdas
        maquina.configurarMaquina("A1", "A2", "B1", "B2");

        // Cargar productos de ejemplo en las celdas
        cargarProductosEjemplo(maquina);

        // Realizar una venta con cambio en la celda B1
        double cambio = maquina.venderConCambio("B1", 2);

        // Mostrar la información después de la venta con cambio
        mostrarInformacionDespuesVentaConCambio(maquina, cambio);
    }

    private static void cargarProductosEjemplo(MaquinaDulces maquina) {
        // Crear productos de ejemplo
        Producto papitas = new Producto("Papitas", 1.70, "KE34");

        // Cargar productos en las celdas
        maquina.cargarProductobasic(papitas, "B1", 3);
    }

    private static void mostrarInformacionDespuesVentaConCambio(MaquinaDulces maquina, double cambio) {
        System.out.println("************************");
        System.out.println("******Celda A2*****");
        mostrarInformacionCelda(maquina.getCelda2(), maquina);
        System.out.println("******Celda B1*****");
        mostrarInformacionCelda(maquina.getCelda3(), maquina);
        System.out.println("******Celda B2*****");
        mostrarInformacionCelda(maquina.getCelda4(), maquina);
        System.out.println("Cambio a entregar: " + cambio);
    }

    private static void mostrarInformacionCelda(Celda celda, MaquinaDulces maquina) {
        if (celda != null) {
            System.out.println("Saldo: " + maquina.getSaldo());
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
