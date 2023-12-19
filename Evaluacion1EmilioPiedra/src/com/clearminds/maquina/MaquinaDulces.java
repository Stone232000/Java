package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
    private ArrayList<Celda> celdas;
    private double saldo;

    // Constructor
    public MaquinaDulces() {
        this.celdas = new ArrayList<>(); // Inicializar la lista aquí
        this.saldo = 0.0;
    }


    // Getter y Setter para celdas
    public ArrayList<Celda> getCeldas() {
        return celdas;
    }

    public void setCeldas(ArrayList<Celda> celdas) {
        this.celdas = celdas;
    }

    // Getter y Setter para saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para agregar una celda a la lista
    public void agregarCelda(String codigoCelda) {
        Celda nuevaCelda = new Celda(codigoCelda);
        celdas.add(nuevaCelda);
    }

    // Método para mostrar la configuración actual de la máquina
    public void mostrarConfiguracion() {
        System.out.println("Configuración actual de la máquina:");
        for (Celda celda : celdas) {
            System.out.println("Celda: " + celda.getCodigo());
        }
    }
    // Método para buscar una celda por código
    public Celda buscarCelda(String codigoCelda) {
        for (Celda celda : celdas) {
            if (celda.getCodigo().equals(codigoCelda)) {
                return celda;
            }
        }
        return null; // Devuelve null si no encuentra la celda con el código dado
    }
    
    // Método para cargar un producto en una celda
    public void cargarProducto(Producto producto, String codigoCelda, int stockInicial) {
        // Invocar al método buscarCelda para obtener la celda correspondiente
        Celda celdaRecuperada = buscarCelda(codigoCelda);

        // Verificar si la celda fue encontrada antes de intentar cargar el producto
        if (celdaRecuperada != null) {
            // Agregar el producto y el stock inicial a la celda recuperada
            celdaRecuperada.ingresarProducto(producto, stockInicial);
        } else {
            System.out.println("No se pudo cargar el producto. La celda no existe: " + codigoCelda);
        }
    }
    public void vender(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);

        if (celda != null && celda.getStock() > 0) {
            celda.setStock(celda.getStock() - 1);
            double precioProducto = celda.getProducto().getPrecio();
            saldo += precioProducto;
            System.out.println("Venta realizada. Saldo actual: " + saldo);
        } else {
            System.out.println("No se puede realizar la venta. La celda no existe o no tiene stock.");
        }
    }


 // Método para mostrar los productos de todas las celdas
    public void mostrarProductos() {
        System.out.println("Productos en la máquina:");
        for (Celda celda : celdas) {
            System.out.println("Celda: " + celda.getCodigo());
            System.out.println("Stock actual: " + celda.getStock());
            if (celda.getProducto() != null) {
                System.out.println("Nombre del producto: " + celda.getProducto().getNombre());
                System.out.println("Precio del producto: " + celda.getProducto().getPrecio());
            } else {
                System.out.println("Sin Producto asignado.");
            }
            System.out.println("------------------------------");
        }
    }
    
     // Método para cargar un producto en una celda
	    public void cargarProductobasic(Producto producto, String codigoCelda, int cantidadInicial) {
	        Celda celdaRecuperada = buscarCelda(codigoCelda);
	        if (celdaRecuperada != null) {
	            celdaRecuperada.ingresarProducto(producto, cantidadInicial);
	        }
     }
	 // Método para buscar un producto en una celda por código
	    public Producto buscarProductoCelda(String codigoCelda) {
	        for (Celda celda : celdas) {
	            if (celda.getCodigo().equals(codigoCelda)) {
	                return celda.getProducto();
	            }
	        }
	        return null; // Devuelve null si no encuentra la celda con el código dado
	    }

	 // Método para consultar el precio de un producto en una celda por código
	    public double consultarPrecio(String codigoCelda) {
	        Celda celda = buscarCelda(codigoCelda);

	        if (celda != null && celda.getProducto() != null) {
	            return celda.getProducto().getPrecio();
	        } else {
	            // Puedes manejar el caso en el que la celda o el producto no existan, por ejemplo, lanzando una excepción
	            throw new IllegalArgumentException("La celda o el producto no existen.");
    }
  }
	    public Celda buscarCeldaProducto(String codigoProducto) {
	        for (Celda celda : celdas) {
	            if (celda.getProducto() != null && celda.getProducto().getCodigo().equals(codigoProducto)) {
	                return celda;
	            }
	        }
	        return null; // Devuelve null si no encuentra la celda con el producto dado
	    }
	    // Método para incrementar la cantidad de productos en una celda
	    public void incrementarProductos(String codigoProducto, int cantidadIncrementar) {
	        for (Celda celda : celdas) {
	            Producto producto = celda.getProducto();
	            if (producto != null && codigoProducto.equals(producto.getCodigo())) {
	                int stockActual = celda.getStock();
	                celda.setStock(stockActual + cantidadIncrementar);
	                break;  // Termina el bucle una vez que se encuentra y actualiza el stock
	            }
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
	     // Método para buscar productos cuyo precio sea menor o igual que el límite
	        public ArrayList<Producto> buscarMenores(double limite) {
	            ArrayList<Producto> productosMenores = new ArrayList<>();

	            for (Celda celda : celdas) {
	                Producto producto = celda.getProducto();

	                // Verificar si la celda tiene un producto y si su precio es menor o igual al límite
	                if (producto != null && producto.getPrecio() <= limite) {
	                    productosMenores.add(producto);
	                }
	            }

	            return productosMenores;
	        }
	        
}