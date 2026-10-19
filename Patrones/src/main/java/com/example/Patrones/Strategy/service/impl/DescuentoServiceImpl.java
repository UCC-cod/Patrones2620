package com.example.Patrones.Strategy.service.impl;

import com.example.Patrones.Strategy.factory.DescuentoStrategyFactory;
import com.example.Patrones.Strategy.service.DescuentoService;
import com.example.Patrones.Strategy.service.DescuentoStrategy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DescuentoServiceImpl implements DescuentoService {
    private final DescuentoStrategyFactory factory;

    @Override
    public double calcularDescuento(String tipoCliente, double valorCompra) {
        DescuentoStrategy strategy = factory.getDescuentoStrategy(tipoCliente);
        return strategy.calcularDescuento(valorCompra);
    }
}
