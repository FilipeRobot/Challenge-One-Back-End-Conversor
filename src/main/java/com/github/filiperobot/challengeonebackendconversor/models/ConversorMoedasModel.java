package com.github.filiperobot.challengeonebackendconversor.models;

import com.github.filiperobot.challengeonebackendconversor.views.componests.OptionPane;


public class ConversorMoedasModel extends conversores {
    private String tipoConversaoTxt;
    private Double valorNumerico;

    public String converterValor(String valor) {
        // TODO refatorar esse codigo pq isso ta muito mal feito T_T

        String valorRetorno = "";

        setValorNumerico(valor);
        if (this.valorNumerico == null) {
            return "";
        }

        switch (tipoConversaoTxt) {
            case "Real para Euro":
                valorRetorno = "€" + mudarSeparadorNumerico(realParaEuro(this.valorNumerico), ',');
                break;
            case "Real para Libras Esterlinas":
                valorRetorno = "£" + mudarSeparadorNumerico(realParaLibraEsterliana(this.valorNumerico), ',');
                break;
            case "Real para Peso Argentino":
                valorRetorno = "$" + mudarSeparadorNumerico(realParaPesoArgentino(this.valorNumerico), ',');
                break;
            case "Real para Peso Chileno":
                valorRetorno = "$" + mudarSeparadorNumerico(realParaPesoChileno(this.valorNumerico), ',');
                break;
            case "Dolar para Real":
                valorRetorno = "R$" + mudarSeparadorNumerico(dolarParaReal(this.valorNumerico), ',');
                break;
            case "Euro para Real":
                valorRetorno = "R$" + mudarSeparadorNumerico(euroParaReal(this.valorNumerico), ',');
                break;
            case "Libras Esterlinas para Real":
                valorRetorno = "R$" + mudarSeparadorNumerico(libraEsterlianaParaReal(this.valorNumerico), ',');
                break;
            case "Peso Argentino para Real":
                valorRetorno = "R$" + mudarSeparadorNumerico(pesoArgentinoParaReal(this.valorNumerico), ',');
                break;
            case "Peso Chileno para Real":
                valorRetorno = "R$" + mudarSeparadorNumerico(pesoChilenoParaReal(this.valorNumerico), ',');
                break;
            default:
                valorRetorno = "$" + mudarSeparadorNumerico(realParaDolar(this.valorNumerico), ',');
                break;
        }
        return valorRetorno;
    }

    private String mudarSeparadorNumerico(String s, char novoSeparador) {
        if (novoSeparador == ',') {
            return s.replace('.', novoSeparador);
        } else {
            return s.replace(',', novoSeparador);
        }
    }

    private void setValorNumerico(String valor) {
        try {
            this.valorNumerico = Double.parseDouble(mudarSeparadorNumerico(valor, '.'));
        } catch (NumberFormatException exception) {
            if (exception.getMessage().compareTo("multiple points") == 0) {
                this.valorNumerico = null;
                OptionPane.erroMessage("O valor deve estar no formato: 1000,00 ou 1000.00");
            }
        }
    }

    public String getValorNumericoTexto(){
        String valorTexto = String.valueOf(this.valorNumerico);
        return mudarSeparadorNumerico(valorTexto, ',');
    }

    public void setTipoConversaoTxt(String tipoConversaoTxt) {
        this.tipoConversaoTxt = tipoConversaoTxt;
    }
}
