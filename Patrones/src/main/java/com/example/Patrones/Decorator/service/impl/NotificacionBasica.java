package com.example.Patrones.Decorator.service.impl;

import com.example.Patrones.Decorator.service.Notificacion;
import org.springframework.stereotype.Component;

@Component
public class NotificacionBasica implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje: "  + mensaje);
    }
}
