/*
Program Name: mortgage.java
Programer: Charles
Date 02-23-18
Version 1.0
In this program we calculate and display the mortgage payment
given the amount of the mortgage, the term of the mortgage, 
and the interest rate of the mortgage
*/
import java.util.Scanner;
public class mortgage {
    public static void main(String args []) {
        //Declaration of variables
        double mortgageAmount, term, rate, monthlyPayment;
        
        //Ask user for mortgage amount
        Scanner getMortgageAmount = new Scanner(System.in);
        System.out.println("Enter mortgage amount");
        mortgageAmount = getMortgageAmount.nextDouble();
        
        //Ask user for number of terms
        Scanner getTerm = new Scanner(System.in);
        System.out.println("Enter number of terms");
        term = getTerm.nextDouble();
        
        //Ask user for interest rate percent
        Scanner getRate = new Scanner(System.in);
        System.out.println("Enter the interest rate");
        rate = getRate.nextDouble();
        
        //Calculate term
        term = (term * 12);
        
        //Calculate interest rate
        rate = (rate/1200.0);
        
        //Calculate monthly payment
        monthlyPayment = ((mortgageAmount * rate)/(1.0 - Math.pow(rate + 1, -term)));
        
        //Output result
        System.out.printf("The monthly payment is $%.2f%n", monthlyPayment);
        
        
    }
}
