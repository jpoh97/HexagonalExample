package com.example.hexagonal.hexagonal.dominio;

class TestDataBuilderMatricula {

    private Long identificadorCandidato;
    private String nombreCandidato;
    private Double puntajeCandidato;

    TestDataBuilderMatricula() {
        this.identificadorCandidato = 2L;
        this.nombreCandidato = "roberto";
        this.puntajeCandidato = 70.4;
    }

    public TestDataBuilderMatricula conNombreCantidadato(String nombreCandidato) {
        this.nombreCandidato = nombreCandidato;
        return this;
    }

    public Matricula build() {
        return new Matricula(identificadorCandidato, nombreCandidato, puntajeCandidato);
    }
}
