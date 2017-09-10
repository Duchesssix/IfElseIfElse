package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double temperature = 92.0;  //declare and initialize variable
        Scanner scanner = new Scanner(System.in);  //create scanner to read user input

        System.out.println("Enter a temperature: ");  //prompt user for input
        temperature = scanner.nextDouble();  //get temperature as a double

        //Use decision making logic to classify temperature

        if (temperature < 97.5) {
            System.out.println(temperature + " degrees is a low temperature.");
        } else if (temperature >= 97.5 && temperature <= 99.5) {
            System.out.println(temperature + " degrees is a normal temperature.");
        } else {
            System.out.println(temperature + " degrees is a high temperature.");
        }
    }
}
