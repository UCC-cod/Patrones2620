package com.example.Patrones.Strategy.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DescuentoRequest {
    private String tipoCliente;
    private double valorCompra;
}
