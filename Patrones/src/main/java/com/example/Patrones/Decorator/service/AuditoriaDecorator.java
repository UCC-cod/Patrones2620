package com.example.Patrones.Decorator.service;

public class AuditoriaDecorator extends NotificacionDecorator{
    public AuditoriaDecorator(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar(String mensaje) {
        notificacion.enviar(mensaje);
        System.out.println("AUDITORIA: mensaje almacenado");
    }
}
