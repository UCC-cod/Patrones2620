package com.example.Patrones.Decorator.service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class NotificacionDecorator implements Notificacion {
    protected Notificacion notificacion;
}
