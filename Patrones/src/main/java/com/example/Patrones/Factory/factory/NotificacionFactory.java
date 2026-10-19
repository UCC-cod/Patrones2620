package com.example.Patrones.Factory.factory;

import com.example.Patrones.Factory.service.Notificacion;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.Map;

@Component
@AllArgsConstructor
public class NotificacionFactory {
    private final Map<String, Notificacion> estrategias;

    public Notificacion getNotificacion(String tipo) {
        Notificacion notificacion = estrategias.get(tipo.toUpperCase());

        if (notificacion == null) {
            throw new IllegalArgumentException("Tipo no soportado " + tipo);
        }

        return notificacion;
    }
}
