package com.example.Patrones.Decorator.service;

public interface NotificacionService {
    void enviar(String mensaje, boolean log, boolean auditoria);
}
