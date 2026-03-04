package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    private TemperatureConverter converter;

    @BeforeEach
    void setUp() {
        converter = new TemperatureConverter();
    }

    @Test
    @DisplayName("fahrenheitToCelsius: basic known points")
    void testFahrenheitToCelsius_basic() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32.0), 1e-9);
        assertEquals(100.0, converter.fahrenheitToCelsius(212.0), 1e-9);
        assertEquals(-40.0, converter.fahrenheitToCelsius(-40.0), 1e-9);
    }

    @Test
    @DisplayName("celsiusToFahrenheit: basic known points")
    void testCelsiusToFahrenheit_basic() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), 1e-9);
        assertEquals(212.0, converter.celsiusToFahrenheit(100.0), 1e-9);
        assertEquals(-40.0, converter.celsiusToFahrenheit(-40.0), 1e-9);
    }

    @Test
    @DisplayName("Round-trip conversion maintains value within tolerance")
    void testRoundTrip() {
        double[] cValues = { -50.0, -40.0, -10.0, 0.0, 20.0, 37.0, 50.0, 80.0 };
        for (double c : cValues) {
            double f = converter.celsiusToFahrenheit(c);
            double c2 = converter.fahrenheitToCelsius(f);
            assertEquals(c, c2, 1e-9, "Round-trip failed for C=" + c);
        }
    }

    @Test
    @DisplayName("isExtremeTemperature: identifies extremes and boundaries correctly")
    void testIsExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-41.0));

        assertFalse(converter.isExtremeTemperature(-40.0));

        assertFalse(converter.isExtremeTemperature(0.0));
        assertFalse(converter.isExtremeTemperature(50.0));

        assertTrue(converter.isExtremeTemperature(60.0));
    }
}
