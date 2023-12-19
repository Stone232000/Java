package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	// Constructor
	   public Producto(String nombre, double precio, String codigo) {
	       this.nombre = nombre;
	       this.precio = precio;
	       this.codigo = codigo;
	   }
	   
	   // Método para incrementar el precio
	   public void incrementarPrecio(int porcentajeIncremento) {
	       // Calcula el porcentaje de incremento y lo suma al precio actual
	       double incremento = precio * (porcentajeIncremento / 100.0);
	       precio += incremento;
	       
	   }

	   // Método para disminuir el precio
	   public void disminuirPrecio(double valorDescuento) {
	       // Resta el valor de descuento al precio actual
	       precio -= valorDescuento;
	   }
	
	//getther setthers
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	

}
