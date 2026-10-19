package com.example.Patrones.Strategy.controller;

import com.example.Patrones.Strategy.dto.DescuentoRequest;
import com.example.Patrones.Strategy.service.DescuentoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strategy")
@AllArgsConstructor
public class DescuentoController {
    private final DescuentoService descuentoService;

    @PostMapping("/descuento")
    public Double Calcular(@RequestBody DescuentoRequest descuentoRequest) {
        return descuentoService.calcularDescuento(
                descuentoRequest.getTipoCliente(),
                descuentoRequest.getValorCompra()
        );
    }
}
