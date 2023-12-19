package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class TestVenderConCambio {

    public static void main(String[] args) {
        // Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Configurar la máquina con los códigos de las celdas
        maquina.agregarCelda("A1");
        maquina.agregarCelda("A2");
        maquina.agregarCelda("B1");
        maquina.agregarCelda("B2");

        // Aumentar una celda A1 con valores específicos
        maquina.cargarProductobasic(new Producto("Doritos", 0.70, "DA56"), "A1", 6);
        maquina.cargarProductobasic(new Producto("Papitas", 0.85, "SSYC"),"B1",4);
        // Realizar una venta con cambio en la celda B1
        double cambio = maquina.venderConCambio("B1", 8);

        // Mostrar la información después de la venta con cambio
        mostrarInformacionDespuesVentaConCambio(maquina, cambio);
    }

    private static void mostrarInformacionDespuesVentaConCambio(MaquinaDulces maquina, double cambio) {
        System.out.println("************************");
        System.out.println("******Celda A1*****");
        mostrarInformacionCelda(maquina.buscarCelda("A1"), maquina);
        System.out.println("******Celda A2*****");
        mostrarInformacionCelda(maquina.buscarCelda("A2"), maquina);
        System.out.println("******Celda B1*****");
        mostrarInformacionCelda(maquina.buscarCelda("B1"), maquina);
        System.out.println("******Celda B2*****");
        mostrarInformacionCelda( maquina.buscarCelda("B2"),maquina);
        System.out.println("");
        System.out.println("Cambio a entregar: " + cambio);
    }

    private static void mostrarInformacionCelda(Celda celda, MaquinaDulces maquina) {
        if (celda != null) {
            // Comentamos la línea que imprime el saldo
            // System.out.println("Saldo: " + maquina.getSaldo());
            System.out.println("Stock: " + celda.getStock());
            Producto producto = celda.getProducto();
            if (producto != null) {
                System.out.println("Nombre Producto: " + producto.getNombre());
                System.out.println("Precio Producto: " + producto.getPrecio());
                // No mostrar el código del producto en la celda
            } else {
                System.out.println("La celda no tiene producto!!");
            }
        }
    }

        

               
            
        
    }
    

