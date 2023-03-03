/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.filiperobot.challengeonebackendconversor.controllers;

import com.github.filiperobot.challengeonebackendconversor.services.ConversorDeTemperaturaService;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * @author FilipeRobot
 */
public class ConversorDeTemperaturaController extends Controller {
    private final ConversorDeTemperaturaService conversorDeTemperaturaService;
    private String celsius;
    private String fahrenheit;
    private String kelvin;
    private final DecimalFormat decimalFormat = new DecimalFormat(".##");

    public ConversorDeTemperaturaController() {
        this.conversorDeTemperaturaService = new ConversorDeTemperaturaService();
    }

    public void fechaConversorDeTemperatura(JInternalFrame conversorDeTemperatura) {
        super.fechaComponente(conversorDeTemperatura);
    }

    public void converterCelsius(String inputCelsius) {
        if (inputCelsius.equals("-")) return;
        try {
            inputCelsius = mudarSeparadorNumerico(inputCelsius, '.');
            conversorDeTemperaturaService.converterCelsius(Double.parseDouble(inputCelsius));
        } catch (NumberFormatException exception) {
            throw new RuntimeException("Não é possivel converter: \"" + inputCelsius + "\" para Fahrenheit ou Kelvin.");
        }

        fahrenheit = decimalFormat.format(conversorDeTemperaturaService.getFahrenheit());
        kelvin = (conversorDeTemperaturaService.getKelvin() == 0.0) ? "0" : decimalFormat.format(conversorDeTemperaturaService.getKelvin());
    }

    public void converterFahrenheit(String inputFahrenheit) {
        if (inputFahrenheit.equals("-")) return;
        try {
            inputFahrenheit = mudarSeparadorNumerico(inputFahrenheit, '.');
            conversorDeTemperaturaService.converterFahrenheit(Double.parseDouble(inputFahrenheit));
        } catch (NumberFormatException exception) {
            throw new RuntimeException("Não é possivel converter: \"" + inputFahrenheit + "\" para Celsius ou Kelvin.");
        }

        celsius = decimalFormat.format(conversorDeTemperaturaService.getCelsius());
        kelvin = (conversorDeTemperaturaService.getKelvin() == 0.0) ? "0" : decimalFormat.format(conversorDeTemperaturaService.getKelvin());
    }

    public void converterKelvin(String inputKelvin) {
        if (inputKelvin.startsWith("-")) {
            throw new RuntimeException("Não existem valores menores que \"0\" na escala Kelvin de temperatura, tente novamente");
        }

        try {
            inputKelvin = mudarSeparadorNumerico(inputKelvin, '.');
            conversorDeTemperaturaService.converterKelvin(Double.parseDouble(inputKelvin));
        } catch (NumberFormatException exception) {
            throw new RuntimeException("Não é possivel converter: \"" + inputKelvin + "\" para Celsius ou Fahrenheit.");
        }

        celsius = decimalFormat.format(conversorDeTemperaturaService.getCelsius());
        fahrenheit = decimalFormat.format(conversorDeTemperaturaService.getFahrenheit());
    }

    @Override
    public void copiar(String texto) {
        texto = mudarSeparadorNumerico(texto, ',');
        super.copiar(texto);
    }

    public String getCelsius() {
        return celsius;
    }

    public String getFahrenheit() {
        return fahrenheit;
    }

    public String getKelvin() {
        return kelvin;
    }
}