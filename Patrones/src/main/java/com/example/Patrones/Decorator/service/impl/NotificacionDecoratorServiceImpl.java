package com.example.Patrones.Decorator.service.impl;

import com.example.Patrones.Decorator.service.AuditoriaDecorator;
import com.example.Patrones.Decorator.service.LogDecorator;
import com.example.Patrones.Decorator.service.Notificacion;
import com.example.Patrones.Decorator.service.NotificacionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotificacionDecoratorServiceImpl implements NotificacionService {
    private final Notificacion notificacionBasica;
    @Override
    public void enviar(String mensaje, boolean log, boolean auditoria) {
        Notificacion notificacion = notificacionBasica;

        if(log) {
            notificacion = new LogDecorator(notificacion);
        }
        if(auditoria) {
            notificacion = new AuditoriaDecorator(notificacion);
        }
        notificacion.enviar(mensaje);
    }
}
