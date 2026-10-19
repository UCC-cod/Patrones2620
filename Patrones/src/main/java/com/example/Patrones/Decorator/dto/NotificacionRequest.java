package com.example.Patrones.Decorator.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificacionRequest {
    private String mensaje;
    private boolean log;
    private boolean auditoria;
}
