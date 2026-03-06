package com.mycompany.bankinterestcalculator;

import java.util.Scanner;

/**
 * @author Luke Joshua (ST10511274) <Luke Joshua at emeris.ac.za>
 */
public class BankInterestCalculator {

    public static void main(String[] args) {
        System.out.println("Activity 4: Bank Interest Calculator");        
        Scanner ScanTxt = new Scanner(System.in);
        Double principalAmount = 0.0, rateOfInterest = 0.0, timeInYears = 0.0;
        
        System.out.print("What is the Principal (loan) amount: $");
        principalAmount = ScanTxt.nextDouble();
        
        System.out.print("What is the Rate of Interest (%): ");
        rateOfInterest = ScanTxt.nextDouble();
        
        System.out.print("What is the Time Period (Years): ");
        timeInYears = ScanTxt.nextDouble();
        
        Double simpleInterest = (principalAmount * rateOfInterest * timeInYears) / 100;
        
        System.out.println("\r\nThe interest earned is $" + simpleInterest);
        System.out.println("Thank you, come again!");
    }
}
