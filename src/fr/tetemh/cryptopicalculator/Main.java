package fr.tetemh.cryptopicalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("The price of the Pi is : 1 Pi -> 1,545544");

            System.out.println("-----------------------------------------");
            System.out.println("Please put a comma and not a period otherwise there is an error, thank you !");

            System.out.print("How many Pi do you have ? : ");
            double nbPi = scanner.nextDouble();
            double money = (float) (nbPi * 1.54);
            System.out.println("You have " + money + " € in Pi");



        }
    }
}
