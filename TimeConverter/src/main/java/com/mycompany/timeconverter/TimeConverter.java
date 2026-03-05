package com.mycompany.timeconverter;

import java.util.Scanner;

/**
 * @author Luke Joshua (ST10511274) <Luke Joshua at emeris.ac.za>
 */
public class TimeConverter {

    public static void main(String[] args) {
        System.out.println("Activity 3: Time Converte");
        
        Scanner ScnMe = new Scanner(System.in);
        
        System.out.print("Please enter a time in hours: ");
        double hours = ScnMe.nextDouble();
        
        System.out.println(hours + " hours converts into " + (hours * 60) + " minutes and " + (hours * 3600) + " seconds. ");
    }
}
