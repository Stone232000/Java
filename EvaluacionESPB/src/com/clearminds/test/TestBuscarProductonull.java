package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductonull {

    public static void main(String[] args) {
        // Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Configurar la máquina con los códigos de las celdas
        maquina.configurarMaquina("A1", "A2", "B1", "B2");

        // Intentar buscar y mostrar productos en las celdas, que en este caso serán nulos
        buscarYMostrarProducto(maquina, "C001");
    }

    private static void buscarYMostrarProducto(MaquinaDulces maquina, String codigoProducto) {
        // Aquí eliges una celda que no tiene un producto asignado
        // En este caso, se elige la celda A1, pero puedes cambiarlo según tus necesidades
        Celda celdaEncontrada = maquina.getCelda1();

        try {
            // Obtener el producto de la celda encontrada (en este caso, el producto es nulo)
            Producto productoEncontrado = (celdaEncontrada != null) ? celdaEncontrada.getProducto() : null;

            // Mostrar el resultado en pantalla, provocando un NullPointerException
            System.out.println("Producto Encontrado: " + obtenerNombreProducto(productoEncontrado));
        } catch (NullPointerException e) {
            // Imprimir información sobre la excepción y la variable que produce el error
            System.out.println("Se produjo una NullPointerException. Variable que produce el error: productoEncontrado");
            e.printStackTrace();
        }
    }

    private static String obtenerNombreProducto(Producto producto) {
        // Este método devuelve el nombre del producto o el mensaje de NullPointerException si el producto es nulo
        return (producto != null) ? producto.getNombre() : "Se produjo una NullPointerException";
    }
}
