package com.example.Patrones.Factory.service.impl;

import com.example.Patrones.Factory.service.Notificacion;
import org.springframework.stereotype.Component;

@Component("SMS")
public class SmsService implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}
