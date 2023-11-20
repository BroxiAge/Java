package com.todocodeacademy.helloWorld.post;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClienteController {
    
    @PostMapping("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli) {
        System.out.println("id : " + cli.getId() + " name : " + cli.getNombre() + " apellido :" + cli.getApellido() );
    }

    @GetMapping("/cliente/traer")
    //@ResponseBody //Sirve para que el response vaya en el cuerpo de la respuesta.
    public List<Cliente> traerClientes() {
        List<Cliente> listaClientes = new ArrayList<Cliente>();

        listaClientes.add(new Cliente(1L, "Zlatan", "Ibrahimovic"));
        listaClientes.add(new Cliente(2L, "Cristiano", "Ronaldo"));
        listaClientes.add(new Cliente(3L, "Lionel", "Messi"));

        return listaClientes;
    }

    @GetMapping("/pruebaresponse")
    ResponseEntity<String> traerRespuesta() {
        return new ResponseEntity<String>("Esto es un mensaje Response ENtity", HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }
    
}
