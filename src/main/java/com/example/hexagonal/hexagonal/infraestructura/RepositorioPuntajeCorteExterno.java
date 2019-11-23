package com.example.hexagonal.hexagonal.infraestructura;

import com.example.hexagonal.hexagonal.dominio.RepositorioPuntajeCorte;

public class RepositorioPuntajeCorteExterno implements RepositorioPuntajeCorte {

    @Override
    public Double consultar() {
        return 75.0;
    }
}
