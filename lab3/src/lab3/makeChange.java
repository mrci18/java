/*
Program Name: makeChange.java
Programer: Charles Ibo
Date 03-07-18
Version 1.0
In this program we ask an amount in cents given by the user.
Then we calculate as many of each half dollars, quarters, nickels, and pennies
make up that amount in that order
*/
import java.util.Scanner;
public class makeChange {
    public static void main(String[] args) {
        //Declaration of variables
        double anyAmount, halfDollars, quarters = 0, dimes = 0, nickels = 0, pennies = 0, cents;
        
        //Ask user for amount
        Scanner getAmount = new Scanner(System.in);
        System.out.println("Please enter the amount of change to calculate");
        anyAmount = getAmount.nextDouble();
        
        //Subtract rounded down number of getAmount to get cents amount
        cents = anyAmount - (Math.floor(anyAmount));
        
        //Divide as much of anyAmount into half dollars
        halfDollars = (Math.floor(anyAmount)/.5);
        
        //Increment halfDollars count if condition is met
        if (cents >= .5)  {
            halfDollars +=1;
            cents = cents - .50;
        } else {
            halfDollars = (Math.floor(anyAmount)/.5);
        }
        
        //Increment quarters count if condition is met
        if (cents >=.25) {
            quarters +=1;
            cents = cents - .25; 
        } else {
            quarters = 0;
        }
        
        //Increment dimes count if condition is met
        if (cents >= .10) {
            dimes +=1;
             cents = cents - .10;
        } else {
            dimes = 0;
        }
        
        //Increment nickels count if condition is met
        if (cents >= .05) {
            nickels +=1;
            cents = cents - .05;
        } else {
            nickels = 0;
        }
        
        //Increment pennies count if condition is met
        if (cents >= .04) {
            pennies +=4;
        } else if (cents >= .03){
            pennies += 3;
        } else if (cents >= .02){
            pennies += 2;
        } else if (cents >= .01){
            pennies += 1;
        } else {
            pennies = 0;
        }
        
        //Prints out how many of each coins
        System.out.printf(anyAmount + " has " 
                + halfDollars + " half dollars, " 
                + quarters + " quarters, " 
                + dimes + " dimes, " 
                + nickels + " nickels, " 
                + pennies + " pennies.");
    }
}
