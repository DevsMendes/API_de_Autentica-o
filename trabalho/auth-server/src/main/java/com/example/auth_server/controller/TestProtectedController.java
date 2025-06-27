package com.example.authserver.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
@Tag(name = "Recursos Protegidos", description = "Endpoints que exigem autenticação JWT")
@SecurityRequirement(name = "bearerAuth")
public class TestProtectedController {

    @Operation(summary = "Endpoint acessível por qualquer utilizador autenticado")
    @GetMapping("/hello")
    public Map<String, String> hello() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        return Map.of("message", "Olá, " + currentPrincipalName + "! Acedeu a um endpoint protegido.");
    }

    @Operation(summary = "Endpoint acessível apenas por utilizadores com o perfil 'ADMIN'")
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public Map<String, String> adminOnly() {
        return Map.of("message", "Bem-vindo, Administrador! Este é um recurso restrito.");
    }
    
    @Operation(summary = "Endpoint acessível apenas por utilizadores com o perfil 'USER'")
    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public Map<String, String> userOnly() {
        return Map.of("message", "Olá, Utilizador! Este é o seu espaço protegido.");
    }
}