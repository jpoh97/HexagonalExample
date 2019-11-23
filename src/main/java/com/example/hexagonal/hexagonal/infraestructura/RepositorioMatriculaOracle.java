package com.example.hexagonal.hexagonal.infraestructura;

import com.example.hexagonal.hexagonal.dominio.Matricula;
import com.example.hexagonal.hexagonal.dominio.RepositorioMatricula;

public class RepositorioMatriculaOracle implements RepositorioMatricula {
    @Override
    public Double consultarPuntaje(Long identificadorCandidato) {
        return 70.0;
    }

    @Override
    public void matricular(Matricula matricula) {

    }
}
