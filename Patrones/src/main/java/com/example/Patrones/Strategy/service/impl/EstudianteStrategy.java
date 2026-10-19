package com.example.Patrones.Strategy.service.impl;

import com.example.Patrones.Strategy.service.DescuentoStrategy;
import org.springframework.stereotype.Component;

@Component("ESTUDIANTE")
public class EstudianteStrategy implements DescuentoStrategy {
    @Override
    public double calcularDescuento(double valorCompra) {
        return valorCompra * 0.1;
    }
}
