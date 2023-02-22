package com.github.filiperobot.challengeonebackendconversor.services;

import com.github.filiperobot.challengeonebackendconversor.models.Conversor;
import com.github.filiperobot.challengeonebackendconversor.models.CotacaoPadrao;

public class ConversorDeMoedasService {
    private final Conversor conversor;

    public ConversorDeMoedasService() {
        this.conversor = new Conversor();
    }

    public String converter(Double valor, Double cotacao) {
        return String.valueOf(conversor.dinheiro(valor, cotacao));
    }

    public String getValorPadrao(int i) {
        return switch (i) {
            case 1 -> CotacaoPadrao.DOLAR.getCotacao();
            case 2 -> CotacaoPadrao.EURO.getCotacao();
            case 3 -> CotacaoPadrao.LIBRAS_ESTARLINAS.getCotacao();
            case 4 -> CotacaoPadrao.PESO_ARGENTINO.getCotacao();
            case 5 -> CotacaoPadrao.PESO_CHILENO.getCotacao();
            default -> CotacaoPadrao.REAL.getCotacao();
        };
    }
}
