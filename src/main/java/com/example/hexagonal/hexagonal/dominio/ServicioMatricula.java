package com.example.hexagonal.hexagonal.dominio;

public class ServicioMatricula {

    private final RepositorioMatricula repositorioMatricula;

    public ServicioMatricula(RepositorioMatricula repositorioMatricula) {
        this.repositorioMatricula = repositorioMatricula;
    }

    public Double consultarPuntaje(Long identificadorCandidato) {
        return repositorioMatricula.consultarPuntaje(identificadorCandidato);
    }

    public void matricular(Matricula matricula, Double puntajeCorte) {
        if (puntajeCorte > 100) {
            throw new RuntimeException();
        }

        if(!matricula.pasaste(puntajeCorte)) {
            throw new RuntimeException();
        }

    }
}
