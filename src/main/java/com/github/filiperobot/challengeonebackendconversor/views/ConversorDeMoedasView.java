/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.github.filiperobot.challengeonebackendconversor.views;

import com.github.filiperobot.challengeonebackendconversor.controllers.ConversorDeMoedasController;
import com.github.filiperobot.challengeonebackendconversor.views.componests.OptionPane;

import java.util.Objects;

/**
 * @author FilipeRobot
 * @GitHub <a href="https://github.com/FilipeRobot">GitHub Profile</a>
 */
public class ConversorDeMoedasView extends javax.swing.JInternalFrame {

    private final ConversorDeMoedasController conversorDeMoedasController;

    /**
     * Creates new form ConversorDeMoedas
     */
    public ConversorDeMoedasView() {
        initComponents();
        this.conversorDeMoedasController = new ConversorDeMoedasController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTipoConversao = new javax.swing.JLabel();
        jComboBoxTipoDeMoeda = new javax.swing.JComboBox<>();
        jLabelValorParaConversao = new javax.swing.JLabel();
        jTextFieldValorParaConversao = new javax.swing.JTextField();
        jLabelValorCotacao = new javax.swing.JLabel();
        jTextFieldValorCotacao = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelValorConvertido = new javax.swing.JLabel();
        jTextFieldValorConvertido = new javax.swing.JTextField();
        jButtonCopiarValor = new javax.swing.JButton();
        jButtonCopiarTudo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jCheckBoxCotacaoPadrao = new javax.swing.JCheckBox();
        jButtonConverter = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Conversor de Moedas");
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
                formInternalFrameOpened(evt);
            }
        });

        jLabelTipoConversao.setLabelFor(jComboBoxTipoDeMoeda);
        jLabelTipoConversao.setText("Qual o tipo de moedas você deseja converter?");

        jComboBoxTipoDeMoeda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Real para Dolar", "Real para Euro", "Real para Libras Esterlinas", "Real para Peso Argentino", "Real para Peso Chileno", "Dolar para Real", "Euro para Real", "Libras Esterlinas para Real", "Peso Argentino para Real", "Peso Chileno para Real"}));
        jComboBoxTipoDeMoeda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoDeMoedaActionPerformed(evt);
            }
        });

        jLabelValorParaConversao.setLabelFor(jTextFieldValorParaConversao);
        jLabelValorParaConversao.setText("Informe o valor para a conversão: ");

        jTextFieldValorParaConversao.setToolTipText("1000,00");

        jLabelValorCotacao.setLabelFor(jTextFieldValorCotacao);
        jLabelValorCotacao.setText("Informe a cotação:");

        jTextFieldValorCotacao.setToolTipText("10,00");

        jLabelValorConvertido.setLabelFor(jTextFieldValorConvertido);
        jLabelValorConvertido.setText("Valor convertido:");

        jTextFieldValorConvertido.setEditable(false);
        jTextFieldValorConvertido.setToolTipText("<html>\nVocê pode copiar toda a menssagem interagindo<br/>\ncom ela ou apenas clicar no botão para copiar apenas<br/>\no valor convertido\n</html>");

        jButtonCopiarValor.setText("Copiar valor");
        jButtonCopiarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarValorActionPerformed(evt);
            }
        });

        jButtonCopiarTudo.setText("Copiar tudo");
        jButtonCopiarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarTudoActionPerformed(evt);
            }
        });

        jCheckBoxCotacaoPadrao.setSelected(true);
        jCheckBoxCotacaoPadrao.setText("Usar cotacao padrao");
        jCheckBoxCotacaoPadrao.setToolTipText("<html>\n       <p>Desmarque para informar uma cotação personalizada</p>\n</html>");
        jCheckBoxCotacaoPadrao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxCotacaoPadraoItemStateChanged(evt);
            }
        });

        jButtonConverter.setText("Converter");
        jButtonConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConverterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jButtonConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jCheckBoxCotacaoPadrao))
                                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBoxCotacaoPadrao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonConverter)
                                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabelValorConvertido)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextFieldValorConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButtonCopiarTudo)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButtonCopiarValor))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabelValorCotacao)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jTextFieldValorCotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabelValorParaConversao)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jTextFieldValorParaConversao))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabelTipoConversao)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jComboBoxTipoDeMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 16, Short.MAX_VALUE))
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelTipoConversao)
                                        .addComponent(jComboBoxTipoDeMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldValorParaConversao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelValorParaConversao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelValorCotacao)
                                                        .addComponent(jTextFieldValorCotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelValorConvertido)
                                        .addComponent(jTextFieldValorConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonCopiarValor)
                                        .addComponent(jButtonCopiarTudo))
                                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        conversorDeMoedasController.fechaConversorDeMoedas(this);
    }//GEN-LAST:event_formInternalFrameClosing

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
//        jTextFieldValorCotacao.setVisible(false);
//        jLabelValorCotacao.setVisible(false);
        jCheckBoxCotacaoPadraoItemStateChanged(null);
        jComboBoxTipoDeMoedaActionPerformed(null);
    }//GEN-LAST:event_formInternalFrameOpened

    private void jComboBoxTipoDeMoedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoDeMoedaActionPerformed
        final String itemSelecionado = Objects.requireNonNull(jComboBoxTipoDeMoeda.getSelectedItem()).toString();
        final String textoPadraoCotacao = "Informe a cotação: ";
        final String textoPadraoConversao = "Infrome o valor para a conversão: ";

        if (itemSelecionado.endsWith("para Real")) {
            jLabelValorCotacao.setText(textoPadraoCotacao + "R$");
            this.realPara(itemSelecionado, textoPadraoConversao);
        } else {
            jLabelValorParaConversao.setText(textoPadraoConversao + "R$");

            this.outraMoedaParaReal(itemSelecionado, textoPadraoCotacao);
        }
    }//GEN-LAST:event_jComboBoxTipoDeMoedaActionPerformed

    private void outraMoedaParaReal(String itemSelecionado, String textoPadraoCotacao) {
        if (itemSelecionado.endsWith("Dolar")) {
            jLabelValorCotacao.setText(textoPadraoCotacao + "US$");
        } else if (itemSelecionado.endsWith("Euro")) {
            jLabelValorCotacao.setText(textoPadraoCotacao + "€");
        } else if (itemSelecionado.endsWith("Esterlinas")) {
            jLabelValorCotacao.setText(textoPadraoCotacao + "£");
        } else {
            jLabelValorCotacao.setText(textoPadraoCotacao + "$");
        }
    }

    private void realPara(String itemSelecionado, String textoPadraoConversao) {
        if (itemSelecionado.startsWith("Dolar")) {
            jLabelValorParaConversao.setText(textoPadraoConversao + "US$");
        } else if (itemSelecionado.startsWith("Euro")) {
            jLabelValorParaConversao.setText(textoPadraoConversao + "€");
        } else if (itemSelecionado.startsWith("Libras")) {
            jLabelValorParaConversao.setText(textoPadraoConversao + "£");
        } else {
            jLabelValorParaConversao.setText(textoPadraoConversao + "$");
        }
    }

    private void jButtonConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConverterActionPerformed
        final String itemSelecionado = Objects.requireNonNull(jComboBoxTipoDeMoeda.getSelectedItem()).toString();
        String valorParaConversao = jTextFieldValorParaConversao.getText().trim();
        String valorCotacao = jTextFieldValorCotacao.getText().trim();

        if (jCheckBoxCotacaoPadrao.isSelected()) {
            valorCotacao = conversorDeMoedasController.usarValorPadrao(itemSelecionado);
        }

        try {
            if ((valorParaConversao.isEmpty() || valorParaConversao.isBlank()) && (valorCotacao.isEmpty() || valorCotacao.isBlank())) {
                throw new RuntimeException("Valor e cotação não foram informados");
            }
            if (valorParaConversao.isEmpty() || valorParaConversao.isBlank()) {
                throw new RuntimeException("Valor não informado");
            }
            if (valorCotacao.isEmpty() || valorCotacao.isBlank()) {
                throw new RuntimeException("Cotação não informada");
            }


            if (!itemSelecionado.startsWith("Real para")) {
                // Adicionar R$ a conversão quando de outras moedas para real
                jTextFieldValorConvertido.setText("R$" + this.conversorDeMoedasController.converter(valorCotacao, valorParaConversao));
            } else {
                // Adicionar simbulos de outras moedas quando a conversão é de real outra moeda
                if (itemSelecionado.endsWith("Dolar")) {
                    jTextFieldValorConvertido.setText("US$" + this.conversorDeMoedasController.converter(valorCotacao, valorParaConversao));
                } else if (itemSelecionado.endsWith("Euro")) {
                    jTextFieldValorConvertido.setText("€" + this.conversorDeMoedasController.converter(valorCotacao, valorParaConversao));
                } else if (itemSelecionado.endsWith("Esterlinas")) {
                    jTextFieldValorConvertido.setText("£" + this.conversorDeMoedasController.converter(valorCotacao, valorParaConversao));
                } else {
                    jTextFieldValorConvertido.setText("$" + this.conversorDeMoedasController.converter(valorCotacao, valorParaConversao));
                }
            }
        } catch (RuntimeException e) {
            jTextFieldValorConvertido.setText("");
            e.printStackTrace();
            OptionPane.erroMessage(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonConverterActionPerformed

    private void jButtonCopiarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarValorActionPerformed
        try {
            conversorDeMoedasController.testaTextoParaCopiar(jTextFieldValorConvertido.getText());

            conversorDeMoedasController.copiarSemSimbolo(jTextFieldValorConvertido.getText());
            OptionPane.okMessage(this, "Texto copiado com sucesso!");
        } catch (Exception exception) {
            OptionPane.erroMessage(this, exception.getMessage());
        }
    }//GEN-LAST:event_jButtonCopiarValorActionPerformed

    private void jButtonCopiarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarTudoActionPerformed
        try {
            conversorDeMoedasController.testaTextoParaCopiar(jTextFieldValorConvertido.getText());

            conversorDeMoedasController.copiar(jTextFieldValorConvertido.getText());
            OptionPane.okMessage(this, "Texto copiado com sucesso!");
        } catch (Exception exception) {
            OptionPane.erroMessage(this, exception.getMessage());
        }
    }//GEN-LAST:event_jButtonCopiarTudoActionPerformed

    private void jCheckBoxCotacaoPadraoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxCotacaoPadraoItemStateChanged
        if (jCheckBoxCotacaoPadrao.isSelected()) {
            jTextFieldValorCotacao.setVisible(false);
            jLabelValorCotacao.setVisible(false);
            jTextFieldValorCotacao.setText("");
            return;
        }
        jTextFieldValorCotacao.setVisible(true);
        jLabelValorCotacao.setVisible(true);
    }//GEN-LAST:event_jCheckBoxCotacaoPadraoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButtonConverter;
    private javax.swing.JButton jButtonCopiarTudo;
    private javax.swing.JButton jButtonCopiarValor;
    private javax.swing.JCheckBox jCheckBoxCotacaoPadrao;
    private javax.swing.JComboBox<String> jComboBoxTipoDeMoeda;
    private javax.swing.JLabel jLabelTipoConversao;
    private javax.swing.JLabel jLabelValorConvertido;
    private javax.swing.JLabel jLabelValorCotacao;
    private javax.swing.JLabel jLabelValorParaConversao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldValorConvertido;
    private javax.swing.JTextField jTextFieldValorCotacao;
    private javax.swing.JTextField jTextFieldValorParaConversao;
    // End of variables declaration//GEN-END:variables
}
