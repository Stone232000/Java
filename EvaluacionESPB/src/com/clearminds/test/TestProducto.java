package com.clearminds.test;

import com.clearminds.componentes.Producto;

public class TestProducto {

	public static void main(String[] args) {

		
			Producto a = new Producto("Papitas", 0.85, "KE34");
			
			System.out.println("Codigo: "+a.getCodigo());
			System.out.println("Nombre: "+a.getNombre());
			System.out.println("Precio: "+a.getPrecio());
			
			a.setPrecio(0.9);
			
			System.out.println("*******Nuevo Precio*****");
			System.out.println("Nuevo Precio: "+a.getPrecio());
			a.incrementarPrecio(50);
			System.out.println("Precio Incrementado: " + a.getPrecio());
			a.disminuirPrecio(0.35);
			System.out.println("Precio Disminuir: "+a.getPrecio());
			
			
	}
	}

			
            