package com.mycompany.bmicalculator;

import java.util.Scanner;

/**
 * @author Luke Joshua (ST10511274) <Luke Joshua at emeris.ac.za>
 */
public class BMICalculator {

    public static void main(String[] args) {
        System.out.println("Activity 5: BMI Calculato");
        
        Scanner bmiIn = new Scanner(System.in);
        
        System.out.print("Please provide weight in Kilograms: ");
        Double weightInKgs = bmiIn.nextDouble();
        
        System.out.print("Please provide Height in Meters: ");
        Double heightInMeters = bmiIn.nextDouble();
        
        Double bmi = weightInKgs / (heightInMeters * heightInMeters);
        
        System.out.println("\r\nThe BMI is " + bmi + ", thank you, come back again!");
    }
}
