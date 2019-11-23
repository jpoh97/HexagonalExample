package com.example.hexagonal.hexagonal.dominio;

import java.util.Optional;

public final class Matricula {

    private Long identificadorCandidato;
    private String nombreCandidato;
    private Double puntajeCandidato;

    public Matricula(Long identificadorCandidato, String nombreCandidato, Double puntajeCandidato) {
        this.setIdentificadorCandidato(identificadorCandidato);
        this.nombreCandidato = nombreCandidato;
        this.puntajeCandidato = puntajeCandidato;
    }

    private void setIdentificadorCandidato(Long identificadorCandidato) {
        if (identificadorCandidato < 0) {
            throw new RuntimeException();
        }
        this.identificadorCandidato = identificadorCandidato;
    }

    public boolean pasaste(Double puntajeCorto) {
        if (getPuntajeCandidato().isPresent()) {
            return getPuntajeCandidato().get() >= puntajeCorto;
        }
        return false;
    }

    public Long getIdentificadorCandidato() {
        return identificadorCandidato;
    }

    public String getNombreCandidato() {
        return nombreCandidato;
    }

    public Optional<Double> getPuntajeCandidato() {
        return Optional.ofNullable(puntajeCandidato);
    }
}

