package com.github.filiperobot.challengeonebackendconversor.models;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Conversor {
    public String dinheiro(Double valor, Double cotacao){
        BigDecimal newValor = new BigDecimal(valor);
        BigDecimal newCotacao = new BigDecimal(cotacao);

        BigDecimal valorFinal = (newValor.multiply(newCotacao));
        valorFinal = valorFinal.setScale(2, RoundingMode.HALF_EVEN);
        return valorFinal.toString();
    }
}
