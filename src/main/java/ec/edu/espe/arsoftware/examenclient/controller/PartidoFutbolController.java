/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arsoftware.examenclient.controller;

import ec.edu.espe.arsoftware.examenclient.dto.PartidoFutbolRQ;
import ec.espe.edu.arquitectura.rest.wsdl.Producto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/partidoFutbol")
public class PartidoFutbolController {

    @Autowired
    private ec.edu.espe.arquitectura.ejemplorest.service.PartidoFutbolService servicio;

    @GetMapping
    public ResponseEntity obtenerPartidoPorFecha(@PathVariable) {

    }


}
