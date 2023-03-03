package com.github.filiperobot.challengeonebackendconversor.services;

public class ConversorDeTemperaturaService {
    private Double celsius;
    private Double fahrenheit;
    private Double kelvin;

    public void converterCelsius(Double inputCelsius) {
        celsius = inputCelsius;

        fahrenheit = (celsius * 9 / 5) + 32;
        kelvin = celsius + 273.15;
    }

    public void converterFahrenheit(Double inputFahrenheit) {
        fahrenheit = inputFahrenheit;

        celsius = (fahrenheit - 32) / 1.8;
        kelvin = (fahrenheit + 459.67) / 1.8;
    }

    public void converterKelvin(Double inputKelvin) {
        kelvin = inputKelvin;

        celsius = kelvin - 273.15;
        fahrenheit = kelvin * 1.8 - 459.67;
    }

    public Double getCelsius() {
        return celsius;
    }

    public Double getFahrenheit() {
        return fahrenheit;
    }

    public Double getKelvin() {
        return kelvin;
    }
}
