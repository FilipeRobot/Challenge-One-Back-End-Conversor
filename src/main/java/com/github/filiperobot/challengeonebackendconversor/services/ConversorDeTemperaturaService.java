package com.github.filiperobot.challengeonebackendconversor.services;

public class ConversorDeTemperaturaService {
    private Double celsius;
    private Double fahrenheit;
    private Double kelvin;

    private final double ZERO_ABSOLUTO_CELSIUS = -273.15;
    private final double ZERO_ABSOLUTO_FAHRENHEIT = -459.67;
    private final double ZERO_ABSOLUTO_KELVIN = 0;

    public void converterCelsius(Double inputCelsius) {
        celsius = inputCelsius;

        fahrenheit = (celsius <= ZERO_ABSOLUTO_CELSIUS) ? ZERO_ABSOLUTO_FAHRENHEIT : (((celsius * 9) / 5) + 32);
        kelvin = (celsius <= ZERO_ABSOLUTO_CELSIUS) ? ZERO_ABSOLUTO_KELVIN : (celsius + 273.15);
    }

    public void converterFahrenheit(Double inputFahrenheit) {
        fahrenheit = inputFahrenheit;

        celsius = (fahrenheit <= ZERO_ABSOLUTO_FAHRENHEIT) ? ZERO_ABSOLUTO_CELSIUS : ((fahrenheit - 32) / 1.8);
        kelvin = (fahrenheit <= ZERO_ABSOLUTO_FAHRENHEIT) ? ZERO_ABSOLUTO_KELVIN : ((fahrenheit + 459.67) / 1.8);
    }

    public void converterKelvin(Double inputKelvin) {
        kelvin = inputKelvin;

        celsius = (kelvin <= ZERO_ABSOLUTO_KELVIN) ? ZERO_ABSOLUTO_CELSIUS : (kelvin - 273.15);
        fahrenheit = (kelvin <= ZERO_ABSOLUTO_KELVIN) ? ZERO_ABSOLUTO_FAHRENHEIT : (kelvin * 1.8 - 459.67);
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
