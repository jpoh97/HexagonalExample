package com.example.hexagonal.hexagonal.aplicacion;

import com.example.hexagonal.hexagonal.dominio.Matricula;
import com.example.hexagonal.hexagonal.dominio.RepositorioPuntajeCorte;
import com.example.hexagonal.hexagonal.dominio.ServicioMatricula;

public class MatricularCarrrera {

    private final ServicioMatricula servicioMatricula;
    private final RepositorioPuntajeCorte repositorioPuntajeCorte;
    private final FabricaMatricula fabricaMatricula;

    public MatricularCarrrera(ServicioMatricula servicioMatricula, RepositorioPuntajeCorte repositorioPuntajeCorte,
                              FabricaMatricula fabricaMatricula) {
        this.servicioMatricula = servicioMatricula;
        this.repositorioPuntajeCorte = repositorioPuntajeCorte;
        this.fabricaMatricula = fabricaMatricula;
    }

    public Matricula ejecutar(Long identificadorCandidato, String nombreCandidato) {
        Double puntajeCandidato = servicioMatricula.consultarPuntaje(identificadorCandidato);
        Double puntajeCorte = repositorioPuntajeCorte.consultar();
        Matricula matricula = fabricaMatricula.crear(identificadorCandidato, nombreCandidato, puntajeCandidato);
        servicioMatricula.matricular(matricula, puntajeCorte);
        return matricula;
    }
}
