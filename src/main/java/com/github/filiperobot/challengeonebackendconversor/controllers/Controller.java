/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.filiperobot.challengeonebackendconversor.controllers;

import com.github.filiperobot.challengeonebackendconversor.views.componests.OptionPane;
import javax.swing.JInternalFrame;

/**
 *
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
}
