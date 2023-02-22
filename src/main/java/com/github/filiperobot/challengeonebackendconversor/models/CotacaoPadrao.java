package com.github.filiperobot.challengeonebackendconversor.models;

public enum CotacaoPadrao {
    REAL("5.17"),
    DOLAR("0.19"),
    EURO("5.51"),
    LIBRAS_ESTARLINAS("6.26"),
    PESO_ARGENTINO("0.027"),
    PESO_CHILENO("0.0064");

    private final String cotacao;
    CotacaoPadrao(String cotacao){
        this.cotacao = cotacao;
    }

    public String getCotacao() {
        return this.cotacao;
    }
}
