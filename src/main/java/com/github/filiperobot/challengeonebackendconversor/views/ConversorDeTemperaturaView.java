/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.github.filiperobot.challengeonebackendconversor.views;

import com.github.filiperobot.challengeonebackendconversor.controllers.ConversorDeTemperaturaController;
import com.github.filiperobot.challengeonebackendconversor.views.componests.OptionPane;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * @author FilipeRobot
 */
public class ConversorDeTemperaturaView extends javax.swing.JInternalFrame {

    private final ConversorDeTemperaturaController conversorDeTemperaturaController;

    /**
     * Creates new form ConversorDeTemperaturaView
     */
    public ConversorDeTemperaturaView() {
        initComponents();
        this.conversorDeTemperaturaController = new ConversorDeTemperaturaController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCelsius = new javax.swing.JPanel();
        jButtonCopiarCelsius = new javax.swing.JButton();
        jTextFieldCelsius = new javax.swing.JTextField();
        jLabelCelsius = new javax.swing.JLabel();
        jPanelFahrenheit = new javax.swing.JPanel();
        jLabelFahrenheit = new javax.swing.JLabel();
        jTextFieldFahrenheit = new javax.swing.JTextField();
        jButtonCopiarFahrenheit = new javax.swing.JButton();
        jPanelKelvin = new javax.swing.JPanel();
        jLabelKelvin = new javax.swing.JLabel();
        jTextFieldKelvin = new javax.swing.JTextField();
        jButtonCopiarKelvin = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Conversor de Temperatura");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }

            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jButtonCopiarCelsius.setText("copiar");
        jButtonCopiarCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarCelsiusActionPerformed(evt);
            }
        });

        jTextFieldCelsius.setColumns(5);
        jTextFieldCelsius.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldCelsiusFocusGained(evt);
            }
        });
        jTextFieldCelsius.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCelsiusKeyPressed(evt);
            }

            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCelsiusKeyReleased(evt);
            }
        });

        jLabelCelsius.setLabelFor(jTextFieldCelsius);
        jLabelCelsius.setText("Celsius Cº :");

        javax.swing.GroupLayout jPanelCelsiusLayout = new javax.swing.GroupLayout(jPanelCelsius);
        jPanelCelsius.setLayout(jPanelCelsiusLayout);
        jPanelCelsiusLayout.setHorizontalGroup(
                jPanelCelsiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelCelsiusLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelCelsius)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCopiarCelsius)
                                .addContainerGap())
        );
        jPanelCelsiusLayout.setVerticalGroup(
                jPanelCelsiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelCelsiusLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelCelsiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelCelsius)
                                        .addComponent(jTextFieldCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonCopiarCelsius))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelFahrenheit.setLabelFor(jTextFieldFahrenheit);
        jLabelFahrenheit.setText("Fahrenheit Fº :");

        jTextFieldFahrenheit.setColumns(5);
        jTextFieldFahrenheit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFahrenheitFocusGained(evt);
            }
        });
        jTextFieldFahrenheit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldFahrenheitKeyPressed(evt);
            }

            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldFahrenheitKeyReleased(evt);
            }
        });

        jButtonCopiarFahrenheit.setText("copiar");
        jButtonCopiarFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarFahrenheitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFahrenheitLayout = new javax.swing.GroupLayout(jPanelFahrenheit);
        jPanelFahrenheit.setLayout(jPanelFahrenheitLayout);
        jPanelFahrenheitLayout.setHorizontalGroup(
                jPanelFahrenheitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelFahrenheitLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelFahrenheit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCopiarFahrenheit)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFahrenheitLayout.setVerticalGroup(
                jPanelFahrenheitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelFahrenheitLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelFahrenheitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelFahrenheit)
                                        .addComponent(jTextFieldFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonCopiarFahrenheit))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelKelvin.setLabelFor(jTextFieldKelvin);
        jLabelKelvin.setText("Kelvin Kº :");

        jTextFieldKelvin.setColumns(5);
        jTextFieldKelvin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldKelvinFocusGained(evt);
            }
        });
        jTextFieldKelvin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldKelvinKeyReleased(evt);
            }
        });

        jButtonCopiarKelvin.setText("copiar");
        jButtonCopiarKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarKelvinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelKelvinLayout = new javax.swing.GroupLayout(jPanelKelvin);
        jPanelKelvin.setLayout(jPanelKelvinLayout);
        jPanelKelvinLayout.setHorizontalGroup(
                jPanelKelvinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelKelvinLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelKelvin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCopiarKelvin)
                                .addContainerGap())
        );
        jPanelKelvinLayout.setVerticalGroup(
                jPanelKelvinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelKelvinLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelKelvinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelKelvin)
                                        .addComponent(jTextFieldKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonCopiarKelvin))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonLimpar.setText("limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanelKelvin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanelCelsius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanelFahrenheit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonLimpar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanelCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanelFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonLimpar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos() {
        jTextFieldCelsius.setText("");
        jTextFieldFahrenheit.setText("");
        jTextFieldKelvin.setText("");
    }

    private void impedirNegativoDuplo(JTextField jTextField, KeyEvent evt) {
        if (evt.getKeyChar() == '-') {
            if (jTextField.getText().equals("-")) {
                jTextField.setText("");
            }
        }
    }

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        conversorDeTemperaturaController.fechaConversorDeTemperatura(this);
    }//GEN-LAST:event_formInternalFrameClosing

    private void jTextFieldCelsiusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCelsiusKeyReleased
        if (conversorDeTemperaturaController.testaStringVazia(jTextFieldCelsius.getText().trim())) {
            limparCampos();
            return;
        }

        try {
            conversorDeTemperaturaController.converterCelsius(jTextFieldCelsius.getText());
        } catch (Exception exception) {
            OptionPane.erroMessage(this, exception.getMessage());
        }

        jTextFieldFahrenheit.setText(conversorDeTemperaturaController.getFahrenheit());
        jTextFieldKelvin.setText(conversorDeTemperaturaController.getKelvin());
    }//GEN-LAST:event_jTextFieldCelsiusKeyReleased

    private void jTextFieldFahrenheitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFahrenheitKeyReleased
        if (conversorDeTemperaturaController.testaStringVazia(jTextFieldFahrenheit.getText().trim())) {
            limparCampos();
            return;
        }

        try {
            conversorDeTemperaturaController.converterFahrenheit(jTextFieldFahrenheit.getText());
        } catch (Exception exception) {
            OptionPane.erroMessage(this, exception.getMessage());
        }

        jTextFieldCelsius.setText(conversorDeTemperaturaController.getCelsius());
        jTextFieldKelvin.setText(conversorDeTemperaturaController.getKelvin());
    }//GEN-LAST:event_jTextFieldFahrenheitKeyReleased

    private void jTextFieldKelvinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldKelvinKeyReleased
        if (conversorDeTemperaturaController.testaStringVazia(jTextFieldKelvin.getText().trim())) {
            limparCampos();
            return;
        }

        try {
            conversorDeTemperaturaController.converterKelvin(jTextFieldKelvin.getText());
        } catch (Exception exception) {
            OptionPane.erroMessage(this, exception.getMessage());
        }

        jTextFieldCelsius.setText(conversorDeTemperaturaController.getCelsius());
        jTextFieldFahrenheit.setText(conversorDeTemperaturaController.getFahrenheit());
    }//GEN-LAST:event_jTextFieldKelvinKeyReleased

    private void jTextFieldCelsiusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCelsiusFocusGained
        limparCampos();
    }//GEN-LAST:event_jTextFieldCelsiusFocusGained

    private void jTextFieldFahrenheitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFahrenheitFocusGained
        limparCampos();
    }//GEN-LAST:event_jTextFieldFahrenheitFocusGained

    private void jTextFieldKelvinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldKelvinFocusGained
        limparCampos();
    }//GEN-LAST:event_jTextFieldKelvinFocusGained

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCopiarCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarCelsiusActionPerformed
        try {
            conversorDeTemperaturaController.testaTextoParaCopiar(jTextFieldCelsius.getText());

            conversorDeTemperaturaController.copiar("Cº" + jTextFieldCelsius.getText());
            OptionPane.okMessage(this, "Copiado com sucesso!");
        } catch (Exception exception) {
            OptionPane.erroMessage(this, exception.getMessage());
        }
    }//GEN-LAST:event_jButtonCopiarCelsiusActionPerformed

    private void jButtonCopiarFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarFahrenheitActionPerformed
        try {
            conversorDeTemperaturaController.testaTextoParaCopiar(jTextFieldFahrenheit.getText());

            conversorDeTemperaturaController.copiar("Fº" + jTextFieldFahrenheit.getText());
            OptionPane.okMessage(this, "Copiado com sucesso!");
        } catch (Exception exception) {
            OptionPane.erroMessage(this, exception.getMessage());
        }
    }//GEN-LAST:event_jButtonCopiarFahrenheitActionPerformed

    private void jButtonCopiarKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarKelvinActionPerformed
        try {
            conversorDeTemperaturaController.testaTextoParaCopiar(jTextFieldKelvin.getText());

            conversorDeTemperaturaController.copiar("Kº" + jTextFieldKelvin.getText());
            OptionPane.okMessage(this, "Copiado com sucesso!");
        } catch (Exception exception) {
            OptionPane.erroMessage(this, exception.getMessage());
        }
    }//GEN-LAST:event_jButtonCopiarKelvinActionPerformed

    private void jTextFieldCelsiusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCelsiusKeyPressed
        impedirNegativoDuplo(jTextFieldCelsius, evt);
    }//GEN-LAST:event_jTextFieldCelsiusKeyPressed

    private void jTextFieldFahrenheitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFahrenheitKeyPressed
        impedirNegativoDuplo(jTextFieldFahrenheit, evt);
    }//GEN-LAST:event_jTextFieldFahrenheitKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCopiarCelsius;
    private javax.swing.JButton jButtonCopiarFahrenheit;
    private javax.swing.JButton jButtonCopiarKelvin;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabelCelsius;
    private javax.swing.JLabel jLabelFahrenheit;
    private javax.swing.JLabel jLabelKelvin;
    private javax.swing.JPanel jPanelCelsius;
    private javax.swing.JPanel jPanelFahrenheit;
    private javax.swing.JPanel jPanelKelvin;
    private javax.swing.JTextField jTextFieldCelsius;
    private javax.swing.JTextField jTextFieldFahrenheit;
    private javax.swing.JTextField jTextFieldKelvin;
    // End of variables declaration//GEN-END:variables
}
