package com.mycompany.currencyconverter;

import java.util.Scanner;

/**
 * @author Luke Joshua (ST10511274) <Luke Joshua at emeris.ac.za>
 */
public class CurrencyConverter {

    public static void main(String[] args) {
        System.out.println("Activity 2: Currency Converte");
               
        Scanner scanner = new Scanner(System.in);
        final double USDTOEURO = 0.92;
        final double USDTOGBP = 0.75;
        
        System.out.print("Please enter the value you wish to convert from USD: $");
        double valToConvert = scanner.nextDouble();
        
        System.out.println("The value $" + valToConvert + " is equal to €" + (USDTOEURO * valToConvert)
                + " Euro (exchange: " + USDTOEURO + ")and £" + (USDTOGBP * valToConvert) + " Pound Sterlink (exchange: " + USDTOGBP + ")");
    }
}
