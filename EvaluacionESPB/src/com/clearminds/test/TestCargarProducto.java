package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestCargarProducto {

    public static void main(String[] args) {
        // Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Configurar la máquina con los códigos de las celdas
        maquina.configurarMaquina("A1", "A2", "B1", "B2");

        // Cargar productos de ejemplo en las celdas
        cargarProductosEjemplo(maquina);

        // Mostrar el contenido detallado de cada celda y el saldo de la máquina
        System.out.println("******Celda A1********");
        mostrarInformacionCelda(maquina.getCelda1());
        System.out.println("******Celda A2********");
        mostrarInformacionCelda(maquina.getCelda2());
        System.out.println("*******Celda B1****");
        mostrarInformacionCelda(maquina.getCelda3());
        
        System.out.println("*******Celda B2***");
        mostrarInformacionCelda(maquina.getCelda4());
        System.out.println("Saldo: " + maquina.getSaldo());
    }

    private static void cargarProductosEjemplo(MaquinaDulces maquina) {
        // Crear productos de ejemplo
        Producto papitas = new Producto("Papitas", 0.85, "KE34");

        // Cargar productos en las celdas
        maquina.cargarProductobasic(papitas, "B1", 4);
        
        
    }

    private static void mostrarInformacionCelda(Celda celda) {
        System.out.println("Stock: " + celda.getStock());
        Producto producto = celda.getProducto();
        if (producto != null) {
            System.out.println("Nombre Producto: " + producto.getNombre());
            System.out.println("Precio Producto: " + producto.getPrecio());
            System.out.println("Codigo Producto: " + producto.getCodigo());
        } else {
            System.out.println("La celda no tiene producto!!!");
        }
    }
}
