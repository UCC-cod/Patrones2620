package com.example.Patrones.Factory.service.impl;

import com.example.Patrones.Factory.service.Notificacion;
import org.springframework.stereotype.Component;

@Component("EMAIL")
public class EmailService implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("Enviando EMAIL: " + mensaje);
    }
}
