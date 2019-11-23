package com.example.hexagonal.hexagonal.aplicacion;

import com.example.hexagonal.hexagonal.dominio.Matricula;

public class FabricaMatricula {
    public Matricula crear(Long identificadorCandidato, String nombreCandidato, Double puntajeCandidato) {
        return new Matricula(identificadorCandidato, nombreCandidato, puntajeCandidato);
    }
}
