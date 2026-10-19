package com.example.Algoritmos.controllers;

import com.example.Algoritmos.models.Producto;
import com.example.Algoritmos.services.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
@AllArgsConstructor
public class ProductoController {

    private final ProductoService productoService;

    @GetMapping
    public List<Producto> listar() {
        return productoService.obtenerProductos();
    }

    @GetMapping("/buscar")
    public Producto buscar(@RequestParam String nombre) {
        return productoService.buscarPorNombre(nombre);
    }

    @GetMapping("/ordenar")
    public List<Producto> ordenar() {
        return productoService.ordenarPorPrecio();
    }

    @GetMapping("/buscar-binaria")
    public Producto buscarBinaria(@RequestParam String nombre) {
        return productoService.buscarPorNombreBinaria(nombre);
    }
}
