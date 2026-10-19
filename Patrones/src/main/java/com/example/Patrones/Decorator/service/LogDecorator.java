package com.example.Patrones.Decorator.service;

public class LogDecorator extends NotificacionDecorator{
    public LogDecorator(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("LOG: Iniciando envío");
        notificacion.enviar(mensaje);
        System.out.println("LOG: Finalizando envío");
    }
}
