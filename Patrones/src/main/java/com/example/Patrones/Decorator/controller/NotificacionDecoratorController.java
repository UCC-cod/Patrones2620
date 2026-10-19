package com.example.Patrones.Decorator.controller;

import com.example.Patrones.Decorator.dto.NotificacionRequest;
import com.example.Patrones.Decorator.service.NotificacionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/decorator")
@AllArgsConstructor
public class NotificacionDecoratorController {
    private final NotificacionService notificacionService;

    @PostMapping("/enviar")
    public String enviar(@RequestBody NotificacionRequest notificacionRequest) {
        notificacionService.enviar(
                notificacionRequest.getMensaje(),
                notificacionRequest.isLog(),
                notificacionRequest.isAuditoria()
        );
        return "Notificación enviada";
    }
}
