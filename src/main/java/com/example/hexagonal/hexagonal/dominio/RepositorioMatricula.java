package com.example.hexagonal.hexagonal.dominio;

public interface RepositorioMatricula {
    Double consultarPuntaje(Long identificadorCandidato);

    void matricular(Matricula matricula);
}
