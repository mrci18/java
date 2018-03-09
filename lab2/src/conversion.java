/*
Program Name: conversion.java
Programer: Charles
Date 02-23-18
Version 1.0
In this program we receive feet and inches from the user and convert it to centimeters
*/
import java.util.Scanner;
public class conversion {
    public static void main (String args []) {
        //Declaration of feet and inches
        double feet, inches, centimeters = 0.0;
        
        //Ask user for number of feet measurement
        Scanner getFeet = new Scanner(System.in);
        System.out.println("Enter number of feet");
        feet = getFeet.nextDouble();
        
        //Ask user for number of inches
        Scanner getInches = new Scanner(System.in);
        System.out.println("Enter number of inches");
        inches = getInches.nextDouble();
        
        //Calculate feet
        feet = (feet * 12);
        
        //Calculate centimeters
        centimeters = 2.54*(feet + inches);
        
        //Show feet and inches conversion two digits after decimal
        System.out.printf("The centimeter conversion is %.2f%n", centimeters);
        
    }
}
