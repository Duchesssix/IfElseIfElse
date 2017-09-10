package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double temperature = 92.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a temperature: ");
        temperature = scanner.nextDouble();

        if (temperature < 97.5) {
            System.out.println(temperature + " degrees is a low temperature.");
        } else if (temperature >= 97.5 && temperature <= 99.5) {
            System.out.println(temperature + " degrees is a normal temperature.");
        } else {
            System.out.println(temperature + " degrees is a high temperature.");
        }
    }
}
