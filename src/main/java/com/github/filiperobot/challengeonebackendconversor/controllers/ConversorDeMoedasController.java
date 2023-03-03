/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.filiperobot.challengeonebackendconversor.controllers;

import com.github.filiperobot.challengeonebackendconversor.services.ConversorDeMoedasService;
import com.github.filiperobot.challengeonebackendconversor.views.componests.OptionPane;

import javax.swing.*;
//import java.awt.Toolkit;
//import java.awt.datatransfer.Clipboard;
//import java.awt.datatransfer.StringSelection;

/**
 * @author FilipeRobot
 * @GitHub <a href="https://github.com/FilipeRobot">GitHub Profile</a>
 */
public class ConversorDeMoedasController extends Controller {
    private final ConversorDeMoedasService conversorDeMoedasService;

    public ConversorDeMoedasController() {
        this.conversorDeMoedasService = new ConversorDeMoedasService();
    }

    public void fechaConversorDeMoedas(JInternalFrame conversorDeMoedas) {
        super.fechaComponente(conversorDeMoedas);
    }

    public void copiarSemSimbolo(String texto) {
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
        super.copiar(texto);
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

    public String usarValorPadrao(String opcaoSelecionada) {
        return this.conversorDeMoedasService.getValorPadrao(opcaoSelecionada);
    }
}
