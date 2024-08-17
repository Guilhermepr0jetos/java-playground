package com.mycode;
public class ConversorTemperatura {
    public static void main(String[] args) {
        int celsius = 40;

        int kelvin = celsiusparaKelvin(celsius);

        double Fahrenheit = celsiusparaFahrenheit(celsius);

        System.out.println("\ntemperatura em kelvin: "+kelvin+" "+"temperatura em celsius: "+kelvinparaCelsius(kelvin)+" "+"temperatura em fahrenheit: "+Fahrenheit);
    }

    public static int celsiusparaKelvin (int celsius) {
        return celsius+273;
    }

    public static double celsiusparaFahrenheit (int celsius) {
        return (celsius*1.8)+32;
    }

    public static int kelvinparaCelsius (int kelvin) {
        return kelvin - 273;
    }
}
