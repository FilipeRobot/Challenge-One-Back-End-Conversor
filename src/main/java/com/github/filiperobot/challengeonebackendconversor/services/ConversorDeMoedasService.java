package com.github.filiperobot.challengeonebackendconversor.services;

import com.github.filiperobot.challengeonebackendconversor.models.Conversor;

public class ConversorDeMoedasService {
    private final Conversor conversor;

    public ConversorDeMoedasService() {
        this.conversor = new Conversor();
    }

    public String converter(Double valor, Double cotacao) {
        return String.valueOf(conversor.dinheiro(valor, cotacao));
    }

    public String getValorPadrao(String opcaoSelecionada) {
        String newCotacaoMoedaParaReal = valorPadraoDeMoedaParaReal(opcaoSelecionada);

        if (newCotacaoMoedaParaReal != null) {
            return newCotacaoMoedaParaReal;
        }

        return valorPadraoDeRealParaMoeda(opcaoSelecionada);
    }

    private static String valorPadraoDeRealParaMoeda(String opcaoSelecionada) {
        if (opcaoSelecionada.startsWith("Real")) {
            if (opcaoSelecionada.endsWith("Euro")) {
                return "0.18";
            }
            if (opcaoSelecionada.endsWith("Esterlinas")) {
                return "0.16";
            }
            if (opcaoSelecionada.endsWith("Argentino")) {
                return "37.75";
            }
            if (opcaoSelecionada.endsWith("Chileno")) {
                return "155.00";
            }
        }

        return "0.19";
    }

    private static String valorPadraoDeMoedaParaReal(String opcaoSelecionada) {
        if (opcaoSelecionada.startsWith("Dolar")) {
            return "5.16";
        }

        if (opcaoSelecionada.startsWith("Euro")) {
            return "5.49";
        }

        if (opcaoSelecionada.startsWith("Libra")) {
            return "6,22";
        }

        if (opcaoSelecionada.startsWith("Peso Argen")) {
            return "0.026";
        }

        if (opcaoSelecionada.startsWith("Peso Chi")) {
            return "0.0064";
        }
        return null;
    }
}
