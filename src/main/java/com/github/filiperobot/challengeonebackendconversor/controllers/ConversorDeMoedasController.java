/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.filiperobot.challengeonebackendconversor.controllers;

import com.github.filiperobot.challengeonebackendconversor.models.ConversorMoedasModel;

import javax.swing.JInternalFrame;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 * @author FilipeRobot
 * @GitHub <a href="https://github.com/FilipeRobot">GitHub Profile</a>
 */
public class ConversorDeMoedasController extends Controller {
    private final ConversorMoedasModel conversorMoedasModel;

    public ConversorDeMoedasController() {
        this.conversorMoedasModel = new ConversorMoedasModel();
    }

    public void fechaConversorDeMoedas(JInternalFrame conversorDeMoedas) {
        super.fechaComponente(conversorDeMoedas);
    }


    public String mudarTextoLabelValorParaConversaoTeste(String itemSelecionado) {
        final String textoPadrao = "Informe o valor para a conversão: ";

        if (itemSelecionado.startsWith("Dolar para") ||
                itemSelecionado.startsWith("Peso Argentino para") ||
                itemSelecionado.startsWith("Peso Chileno para")
        ) {
            return textoPadrao + "$";
        } else if (itemSelecionado.startsWith("Euro para")) {
            return textoPadrao + "€";
        } else if (itemSelecionado.startsWith("Libras Esterlinas para")) {
            return textoPadrao + "£";
        } else {
            return textoPadrao + "R$";
        }
    }

    public void copiar(String texto, String itemSelecionado) {
        if (itemSelecionado.startsWith("Dolar para") ||
                itemSelecionado.startsWith("Peso Argentino para") ||
                itemSelecionado.startsWith("Peso Chileno para")
        ) {
            // remover $ do texto
            texto = texto.replace("R$", "");
        } else if (itemSelecionado.startsWith("Euro para")) {
            // Remover "€" do texto
            texto = texto.replace("€", "");
        } else if (itemSelecionado.startsWith("Libras Esterlinas para")) {
            //Remover "£" do texto
            texto = texto.replace("£", "");
        } else {
            // remove $ do texto
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

    public String converter(String tipoConversao, String valor) {
        conversorMoedasModel.setTipoConversaoTxt(tipoConversao);
        return conversorMoedasModel.converterValor(valor);
    }

    public String getUltimoValorNumerico() {
        return conversorMoedasModel.getValorNumericoTexto();
    }
}
