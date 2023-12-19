package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoEnCelda {

	public static void main(String[] args) {
		
		// Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Agregar celda A con stock 0 y sin producto asignado
        maquina.agregarCelda("A");
        maquina.agregarCelda("S");

        // Agregar producto "Papitas" en la celda A
        Producto papitas = new Producto("Papitas", 1.5, "PAP001");
        maquina.cargarProductobasic(papitas, "A", 10);
   

        // Buscar el producto en la celda A
        Producto productoEnCeldaA = maquina.buscarProductoCelda("A");
        Producto productoEnCeldaS = maquina.buscarProductoCelda("S");

        // Mostrar el resultado en pantalla
        if (productoEnCeldaA != null) {
        
            System.out.println("Producto Encontrado: "+ productoEnCeldaA.getNombre());
            
            
        } else {
            System.out.println("Null");
        }
        if (productoEnCeldaS != null) {
        	 System.out.println("Producto Encontrado: "+ productoEnCeldaS.getNombre());
             
             
        } else {
            System.out.println("Null");
        	
        }
        
        
            
   

	}

}
