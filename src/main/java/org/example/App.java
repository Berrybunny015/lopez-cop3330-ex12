package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("\nEnter the principal amount: "); //ask the user for the principal
        Scanner principalInput = new Scanner(System.in); //scan for the principal
        double principalAmount = principalInput.nextDouble();

        System.out.println("\nEnter the rate of interest (%): "); //ask the user for the rate of interest
        Scanner rateOfInterestInput = new Scanner(System.in); //scan for the rate of interest
        double rateOfInterest = rateOfInterestInput.nextDouble();

        System.out.println("\nEnter the number of years: "); //ask the user for the number of years
        Scanner numYearsInput = new Scanner(System.in); //scan for the number of years
        double numYears = numYearsInput.nextDouble();

        double rateOfInterestPercent = rateOfInterest / 100.0; //calculate the rate of interest into a percentage

        double endInvestmentAmount = (principalAmount) * (1 + (rateOfInterestPercent * numYears)); //calculate the amount of money that will be earned by the end of the investment

        //output the amount of money the user would make at the end of their investment
        System.out.println("\nAfter " + (int)numYears + " years at " + rateOfInterest + "%, the investment will be worth $" + (int)endInvestmentAmount +".");
    }
}