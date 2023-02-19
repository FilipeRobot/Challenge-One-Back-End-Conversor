package com.github.filiperobot.challengeonebackendconversor.models;

public abstract class conversores {
    protected String realParaDolar(Double valor){
        double cotacao = 0.19;
        return String.valueOf(valor * cotacao);
    }
    protected String realParaEuro(Double valor){
        double cotacao = 0.18;
        return String.valueOf(valor * cotacao);
    }
    protected String realParaLibraEsterliana(Double valor){
        double cotacao = 0.16;
        return String.valueOf(valor * cotacao);
    }
    protected String realParaPesoArgentino(Double valor){
        double cotacao = 37.28;
        return String.valueOf(valor * cotacao);
    }
    protected String realParaPesoChileno(Double valor){
        double cotacao = 153.52;
        return String.valueOf(valor * cotacao);
    }
    protected String dolarParaReal(Double valor){
        double cotacao = 5.17;
        return String.valueOf(valor * cotacao);
    }
    protected String euroParaReal(Double valor){
        double cotacao = 5.54;
        return String.valueOf(valor * cotacao);
    }
    protected String libraEsterlianaParaReal(Double valor){
        double cotacao = 6.22;
        return String.valueOf(valor * cotacao);
    }
    protected String pesoArgentinoParaReal(Double valor){
        double cotacao = 0.027;
        return String.valueOf(valor * cotacao);
    }
    protected String pesoChilenoParaReal(Double valor){
        double cotacao = 0.0066;
        return String.valueOf(valor * cotacao);
    }
}
