package org.example;

/**
 * A simple utility class for converting temperatures between Fahrenheit and Celsius
 * and checking whether a Celsius temperature is considered extreme.
 */
public class TemperatureConverter {

    /**
     * Converts a temperature from Fahrenheit to Celsius.
     * Formula: (Fahrenheit - 32) * 5 / 9
     *
     * @param fahrenheit temperature in Fahrenheit
     * @return corresponding temperature in Celsius
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit.
     * Formula: (Celsius * 9 / 5) + 32
     *
     * @param celsius temperature in Celsius
     * @return corresponding temperature in Fahrenheit
     */
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    /**
     * Determines whether a Celsius temperature is considered extreme.
     * Extreme if below -40°C or above 50°C.
     *
     * @param celsius temperature in Celsius
     * @return true if extreme, false otherwise
     */
    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40.0 || celsius > 50.0;
    }
}
