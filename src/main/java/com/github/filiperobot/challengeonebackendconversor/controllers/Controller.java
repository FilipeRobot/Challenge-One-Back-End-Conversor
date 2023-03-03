/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.filiperobot.challengeonebackendconversor.controllers;

import com.github.filiperobot.challengeonebackendconversor.views.componests.OptionPane;

import javax.swing.JInternalFrame;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 * @author FilipeRobot
 * @GitHub <a href="https://github.com/FilipeRobot">GitHub Profile</a>
 */
public abstract class Controller {
    private String fechaTitle = "Confirmar fechamento de ";
    private String fechaMessage = "Você realmente deseja fechar o ";

    public void fechar(boolean dev) {
        System.exit(0);
    }

    public void fechaComponente(JInternalFrame internalFrame) {
        fechaMessage += internalFrame.getTitle() + "?";
        fechaTitle += internalFrame.getTitle();
        if (OptionPane.yesNo(fechaMessage, fechaTitle, OptionPane.QUESTION_MESSAGE) > 0) {
            return;
        }
        internalFrame.dispose();
    }

    public String mudarSeparadorNumerico(String s, char novoSeparador) {
        if (novoSeparador == ',') {
            return s.replace('.', novoSeparador);
        } else {
            return s.replace(',', novoSeparador);
        }
    }

    public void copiar(String texto) {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(texto);
        clipboard.setContents(stringSelection, stringSelection);
    }

    public boolean testaStringVazia(String texto) {
        return texto.isEmpty() || texto.isBlank();
    }

    public void testaTextoParaCopiar(String texto) {
        if (testaStringVazia(texto.trim())) {
            throw new RuntimeException("Nenhum valor para copiar");
        }
    }
}
