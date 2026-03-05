package com.mycompany.gradeaveragecalculator;

import java.util.Scanner;

/**
 * @author Luke Joshua (ST10511274)
 */
public class GradeAverageCalculator {

    public static void main(String[] args) {
        System.out.println("Activity 1: Grade Average Calculator");
        
        Scanner scanIn = new Scanner(System.in);
        double score1= 0, score2 = 0, score3 = 0;
        
        System.out.print("Please enter your first subject grade: ");
        score1 = scanIn.nextDouble();
        
        System.out.print("Please enter your second subject grade: ");
        score2 = scanIn.nextDouble();
                
        System.out.print("Please enter your third subject grade: ");
        score3 = scanIn.nextDouble();
        
        double Average = (score1 + score2 + score3) / 3;
        
        System.out.println("Your average grade for the 3 subjects is: " + Average + "%");
    }
}
