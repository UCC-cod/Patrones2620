package com.example.Patrones.Factory.controller;

import com.example.Patrones.Factory.dto.NotificacionRequest;
import com.example.Patrones.Factory.service.NotificacionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory")
@AllArgsConstructor
public class NotificacionFactoryController {
    private final NotificacionService service;

    @PostMapping("/enviar")
    public String enviar(@RequestBody NotificacionRequest notificacion) {
        service.enviar(
                notificacion.getTipo(),
                notificacion.getMensaje()
        );
        return "OK";
    }
}
