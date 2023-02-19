/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.filiperobot.challengeonebackendconversor.controllers;

import com.github.filiperobot.challengeonebackendconversor.views.componests.OptionPane;
import javax.swing.JFrame;

/**
 *
 * @author FilipeRobot
 * @GitHub <a href="https://github.com/FilipeRobot">GitHub Profile</a>
 */
public class AppController extends Controller{
    @Override
    public void fechar() {
        // TODO: COMENTARIO APENAS DURANDO O DESENVOLVIMENTO, Descomentar if quando terminar
        if (OptionPane.yesNo("Você realmente deseja fechar a aplicação?",
                "Confirmação de saida",
                OptionPane.QUESTION_MESSAGE) > 0) {
            return;
        }
        System.exit(0);
    }
    
    public void fecharApp(JFrame app){
        if (OptionPane.yesNo("Você realmente deseja fechar a aplicação?",
                "Confirmação de saida",
                OptionPane.QUESTION_MESSAGE) > 0) {
            return;
        }
        app.dispose();
        OptionPane.okMessage("Programa finalizado");
        System.exit(0);
    }
    

}
