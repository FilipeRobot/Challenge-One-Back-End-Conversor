/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.filiperobot.challengeonebackendconversor.controllers;

import com.github.filiperobot.challengeonebackendconversor.services.ConversorDeMoedasService;

import javax.swing.JInternalFrame;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Arrays;
import java.util.List;

/**
 * @author FilipeRobot
 * @GitHub <a href="https://github.com/FilipeRobot">GitHub Profile</a>
 */
public class ConversorDeMoedasController extends Controller {
    private final ConversorDeMoedasService conversorDeMoedasService;
    private static final int BRL = 0;

    private final List<String> listaDeConversoesPadrao = Arrays.asList(
            "Real para Dolar",
            "Real para Euro",
            "Real para Libras Esterlinas",
            "Real para Peso Argentino",
            "Real para Peso Chileno"
    );

    public ConversorDeMoedasController() {
        this.conversorDeMoedasService = new ConversorDeMoedasService();
    }

    public void fechaConversorDeMoedas(JInternalFrame conversorDeMoedas) {
        super.fechaComponente(conversorDeMoedas);
    }

    public void copiar(String texto) {
        if (texto.startsWith("R$")) {
            // remover R$ do texto
            texto = texto.replace("R$", "");
        }

        if (texto.startsWith("€")) {
            // Remover "€" do texto
            texto = texto.replace("€", "");
        }

        if (texto.startsWith("£")) {
            // Remover "€" do texto
            texto = texto.replace("£", "");
        }

        if (texto.startsWith("US$")) {
            // Remover "€" do texto
            texto = texto.replace("US$", "");
        }

        if (texto.startsWith("$")) {
            // Remover "€" do texto
            texto = texto.replace("$", "");
        }

        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(texto);
        clipboard.setContents(stringSelection, stringSelection);
    }

    public void copiarTudo(String texto) {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(texto);
        clipboard.setContents(stringSelection, stringSelection);
    }

    public String converter(String cotacao, String valor) {
        double newCotacao;
        double newValor;

        cotacao = mudarSeparadorNumerico(cotacao, '.');
        valor = mudarSeparadorNumerico(valor, '.');

        try {
            newCotacao = Double.parseDouble(cotacao);
        } catch (NumberFormatException numberFormatException) {
            throw new RuntimeException("Não foi possivel converter \"" + cotacao + "\" em número, tente novamente!");
        }

        try {
            newValor = Double.parseDouble(valor);
        } catch (NumberFormatException numberFormatException) {
            throw new RuntimeException("Não foi possivel converter \"" + valor + "\" em número, tente novamente!");
        }
        return mudarSeparadorNumerico(conversorDeMoedasService.converter(newValor, newCotacao), ',');
    }

    private String mudarSeparadorNumerico(String s, char novoSeparador) {
        if (novoSeparador == ',') {
            return s.replace('.', novoSeparador);
        } else {
            return s.replace(',', novoSeparador);
        }
    }

    public String usarValorPadrao(String item) {
        for (int i = 0; i < listaDeConversoesPadrao.size(); i++) {
            if (item.equals(listaDeConversoesPadrao.get(i))) {
                return this.conversorDeMoedasService.getValorPadrao(i + 1);
            }
        }
        return this.conversorDeMoedasService.getValorPadrao(BRL);
    }
}
