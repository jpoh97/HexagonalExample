package com.example.hexagonal.hexagonal.infraestructura;

import com.example.hexagonal.hexagonal.aplicacion.MatricularCarrrera;
import com.example.hexagonal.hexagonal.dominio.Matricula;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorMatricula {

    private final MatricularCarrrera matricularCarrrera;

    public ControladorMatricula(MatricularCarrrera matricularCarrrera) {
        this.matricularCarrrera = matricularCarrrera;
    }

    @PostMapping("/matricula/{id}/{nombre}")
    public Matricula matricular(@PathVariable("id") Long identificadorCandidato,
                                @PathVariable("nombre") String nombreCandidato) {
        return matricularCarrrera.ejecutar(identificadorCandidato, nombreCandidato);
    }
}
