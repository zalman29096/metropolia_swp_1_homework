package org.example;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double c = 100.0;
        double f = converter.celsiusToFahrenheit(c);
        System.out.println("Celsius " + c + " -> Fahrenheit " + f);

        double f2 = 32.0;
        double c2 = converter.fahrenheitToCelsius(f2);
        System.out.println("Fahrenheit " + f2 + " -> Celsius " + c2);

        System.out.println("Is 60C extreme? " + converter.isExtremeTemperature(60));
    }
}
