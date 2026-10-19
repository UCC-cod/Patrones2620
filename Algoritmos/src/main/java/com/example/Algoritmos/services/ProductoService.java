package com.example.Algoritmos.services;

import com.example.Algoritmos.models.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {

    private List<Producto> productos = List.of(
            new Producto(1, "Mouse", 50.0),
            new Producto(2, "Monitor", 800.0),
            new Producto(3, "Laptop", 2500.0),
            new Producto(4, "Teclado", 120.0),
            new Producto(5, "Impresora", 450.0),
            new Producto(6, "Escaner", 380.0),
            new Producto(7, "Webcam", 90.0),
            new Producto(8, "Diadema", 75.0),
            new Producto(9, "Parlantes", 150.0),
            new Producto(10, "Disco SSD", 300.0),
            new Producto(11, "Memoria RAM", 220.0),
            new Producto(12, "Tarjeta Grafica", 1800.0),
            new Producto(13, "Procesador", 1400.0),
            new Producto(14, "Router", 280.0),
            new Producto(15, "Switch", 650.0),
            new Producto(16, "Tablet", 1200.0),
            new Producto(17, "Smartphone", 2300.0),
            new Producto(18, "Microfono", 180.0),
            new Producto(19, "Camara", 950.0),
            new Producto(20, "Proyector", 2100.0)
    );

    public List<Producto> obtenerProductos() {
        return productos;
    }

    public Producto buscarPorNombre(String nombre) {
        return busquedaLineal(productos, nombre);
    }

    public List<Producto> ordenarPorPrecio() {
        return bubbleSort(new ArrayList<>(productos));
    }

    public Producto buscarPorNombreBinaria(String nombre){
        List<Producto> productosOrdenados = new ArrayList<>(productos);
        productosOrdenados.sort(
                (p1, p2) -> p1.getNombre()
                        .compareTo(p2.getNombre())
        );
        return busquedaBinaria(productosOrdenados, nombre);
    }

    private Producto busquedaLineal(List<Producto> productos, String nombre) {

        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }

        return null;
    }

    private Producto busquedaBinaria(List<Producto> productos, String nombre) {

        int inicio = 0;
        int fin = productos.size() - 1;

        while (inicio <= fin) {

            int medio = (inicio + fin) / 2;

            int comparacion = productos.get(medio)
                    .getNombre()
                    .compareToIgnoreCase(nombre);

            if (comparacion == 0) {
                return productos.get(medio);
            }

            if (comparacion < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return null;
    }

    private List<Producto> bubbleSort(List<Producto> productos) {

        for (int i = 0; i < productos.size() - 1; i++) {

            for (int j = 0; j < productos.size() - i - 1; j++) {

                if (productos.get(j).getPrecio()
                        > productos.get(j + 1).getPrecio()) {

                    Producto temp = productos.get(j);
                    productos.set(j, productos.get(j + 1));
                    productos.set(j + 1, temp);
                }
            }
        }

        return productos;
    }
}
