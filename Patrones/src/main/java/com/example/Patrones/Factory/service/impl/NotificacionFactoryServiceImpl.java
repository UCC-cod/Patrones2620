package com.example.Patrones.Factory.service.impl;

import com.example.Patrones.Factory.factory.NotificacionFactory;
import com.example.Patrones.Factory.service.Notificacion;
import com.example.Patrones.Factory.service.NotificacionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotificacionFactoryServiceImpl implements NotificacionService {
    private final NotificacionFactory notificacionFactory;

    public  void enviar(String tipo, String mensaje) {
        Notificacion notificacion = notificacionFactory.getNotificacion(tipo);
        notificacion.enviar(mensaje);
    }
}
