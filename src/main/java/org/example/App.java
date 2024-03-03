package org.example;

public class App {
    public static void main(String[] args) {
        float fahCel = 212;
        float kelCel = 273;
        double kelFah = 300.1;

        System.out.println(fahCel + " Fahrenheit is equal to " + FahrToCel.convertFahr(fahCel) + " Celsius.");
        System.out.println(kelCel + " Kelvin is equal to " + KelvinToCel.kelvinToCel(kelCel) + " Celsius.");
        System.out.println(kelFah + " Kelvin is equal to " + Math.round(KelToFahr.kelToFahr((float) kelFah)) + " Fahrenheit.");
    }
}
