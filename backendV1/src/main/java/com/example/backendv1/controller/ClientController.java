package com.example.backendv1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClientController {

    @GetMapping("/welcome")
        public String mostrarMensagem()
        {
            return "Seja bem vindo ao sistema!";
        }

}
