package com.example.Patrones.Strategy.factory;
import com.example.Patrones.Strategy.service.DescuentoStrategy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@AllArgsConstructor
public class DescuentoStrategyFactory {
    private final Map<String, DescuentoStrategy> estrategias;
    public DescuentoStrategy getDescuentoStrategy(String tipo) {
        DescuentoStrategy estrategia = estrategias.get(tipo.toUpperCase());
        if (estrategia == null) {
            throw new IllegalArgumentException("Tipo no soportado " + tipo);
        }

        return estrategia;
    }
}
