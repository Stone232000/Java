package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	


	// Método para configurar la máquina con códigos de celda
    public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
        celda1 = new Celda(codigoCelda1);
        celda2 = new Celda(codigoCelda2);
        celda3 = new Celda(codigoCelda3);
        celda4 = new Celda(codigoCelda4);
    }

    // Método para mostrar la configuración actual de la máquina
    public void mostrarConfiguracion() {
        System.out.println("Celda 1: " + celda1.getCodigo());
        System.out.println("Celda 2: " + celda2.getCodigo());
        System.out.println("Celda 3: " + celda3.getCodigo());
        System.out.println("Celda 4: " + celda4.getCodigo());
        System.out.println("Saldo actual: " + saldo);
    }

    // Método para buscar una celda por su código
    public Celda buscarCelda(String codigoCelda) {
        if (celda1 != null && celda1.getCodigo().equals(codigoCelda)) {
            return celda1;
        } else if (celda2 != null && celda2.getCodigo().equals(codigoCelda)) {
            return celda2;
        } else if (celda3 != null && celda3.getCodigo().equals(codigoCelda)) {
            return celda3;
        } else if (celda4 != null && celda4.getCodigo().equals(codigoCelda)) {
            return celda4;
        }
        return null;
    }

    // Método para cargar un producto en una celda
    public void cargarProducto(String nombre, double precio, String codigo, String codigoCelda, int cantidadInicial) {
        // Utilizar los métodos de acceso para obtener la celda y cargar el producto
        Celda celdaRecuperada = null;

        // Obtener la celda mediante el código
        if ("A1".equals(codigoCelda)) {
            celdaRecuperada = getCelda1();
        } else if ("A2".equals(codigoCelda)) {
            celdaRecuperada = getCelda2();
        } else if ("B1".equals(codigoCelda)) {
            celdaRecuperada = getCelda3();
        } else if ("B2".equals(codigoCelda)) {
            celdaRecuperada = getCelda4();
        }

        // Si la celda se encontró, cargar el producto
        if (celdaRecuperada != null) {
            celdaRecuperada.ingresarProducto(new Producto(nombre, precio, codigo), cantidadInicial);
        }
    }

 // Método para mostrar el producto de cada celda y el saldo de la máquina
    public void mostrarProducto() {
        System.out.println("Celda 1: " + obtenerInformacionCelda(celda1));
        System.out.println("Celda 2: " + obtenerInformacionCelda(celda2));
        System.out.println("Celda 3: " + obtenerInformacionCelda(celda3));
        System.out.println("Celda 4: " + obtenerInformacionCelda(celda4));
        System.out.println("Saldo actual: " + saldo);
    }
       //buscarProductoencelda
    private String obtenerInformacionCelda(Celda celda) {
        if (celda != null && celda.getProducto() != null) {
            return "Producto: " + celda.getProducto().getNombre() + ", Stock: " + celda.getStock();
        } else {
            return "Celda vacía";
        }
    }

    // Método para consultar el precio del producto en una celda
    public double consultarPrecio(String codigoCelda) {
        Celda celdaEncontrada = buscarCelda(codigoCelda);
        if (celdaEncontrada != null && celdaEncontrada.getProducto() != null) {
            return celdaEncontrada.getProducto().getPrecio();
        }
        return 0.0; // Precio cero si no se encuentra la celda o el producto
    }

 // Método para buscar la celda que contiene un producto por su código
    public Celda buscarCeldaProducto(String codigoProducto) {
        if (celda1 != null && celda1.getProducto() != null && celda1.getProducto().getCodigo().equals(codigoProducto)) {
            return celda1;
        } else if (celda2 != null && celda2.getProducto() != null && celda2.getProducto().getCodigo().equals(codigoProducto)) {
            return celda2;
        } else if (celda3 != null && celda3.getProducto() != null && celda3.getProducto().getCodigo().equals(codigoProducto)) {
            return celda3;
        } else if (celda4 != null && celda4.getProducto() != null && celda4.getProducto().getCodigo().equals(codigoProducto)) {
            return celda4;
        }
        return null;
    }

    // Método para incrementar la cantidad de productos en una celda
    public void incrementarProductos(String codigoProducto, int cantidadIncrementar) {
        Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
        if (celdaEncontrada != null) {
            int stockActual = celdaEncontrada.getStock();
            celdaEncontrada.setStock(stockActual + cantidadIncrementar);
        }
    }

    // Método para vender un producto y actualizar el saldo de la máquina
    public void vender(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getStock() > 0) {
            double precioProducto = celda.getProducto().getPrecio();
            celda.setStock(celda.getStock() - 1);
            saldo += precioProducto;
            System.out.println("Venta realizada. Saldo actual: " + saldo);
        } else {
            System.out.println("No se pudo realizar la venta. Celda vacía o sin stock.");
        }
    }

    // Método para vender con cambio y devolver el cambio al cliente
    public double venderConCambio(String codigoCelda, double montoIngresado) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getStock() > 0) {
            double precioProducto = celda.getProducto().getPrecio();
            if (montoIngresado >= precioProducto) {
                celda.setStock(celda.getStock() - 1);
                saldo += precioProducto;
                double cambio = montoIngresado - precioProducto;
                System.out.println("Venta realizada. Saldo actual: " + saldo);
                System.out.println("Cambio a entregar: " + cambio);
                return cambio;
            } else {
                System.out.println("Monto insuficiente para realizar la compra.");
            }
        } else {
            System.out.println("No se pudo realizar la venta. Celda vacía o sin stock.");
        }
        return 0.0; // Si la venta no se realiza, el cambio es cero
    }
 // Método para obtener el nombre del producto por su código
    public String obtenerNombreProducto(String codigoProducto) {
        Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
        if (celdaEncontrada != null) {
            Producto productoEncontrado = celdaEncontrada.getProducto();
            return (productoEncontrado != null) ? productoEncontrado.getNombre() : "null";
        }
        return "null";
    }

	//****
	public Celda getCelda1() {
		return celda1;
	}
	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}
	public Celda getCelda2() {
		return celda2;
	}
	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}
	public Celda getCelda3() {
		return celda3;
	}
	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}
    public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
		
		// Método para cargar un producto en una celda
	    public void cargarProductobasic(Producto producto, String codigoCelda, int cantidadInicial) {
	        Celda celdaRecuperada = buscarCelda(codigoCelda);
	        if (celdaRecuperada != null) {
	            celdaRecuperada.ingresarProducto(producto, cantidadInicial);
	        }
	    }
	

	
	}



	
	

