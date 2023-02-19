/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.filiperobot.challengeonebackendconversor.views.componests;

import javax.swing.JOptionPane;

/**
 *
 * @author FilipeRobot
 * @GitHub <a href="https://github.com/FilipeRobot">GitHub Profile</a>
 */
public abstract class OptionPane extends JOptionPane{
    public static int yesNo(String message, String title, int messageType){
        return JOptionPane.showConfirmDialog(null,
                message,
                title,
                JOptionPane.YES_NO_OPTION,
                messageType);
    }

    public static void erroMessage(String message){
        JOptionPane.showMessageDialog(
                null,
                message,
                "Error",
                JOptionPane.ERROR_MESSAGE
        );
    }

    public static void okMessage(String message){
        JOptionPane.showMessageDialog(
                null,
                message,
                "Tudo certo!",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
