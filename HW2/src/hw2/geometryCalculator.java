package hw2;
/*
Program Name: geometryCalculator.java
Programer: Charles
Date 03-16-18
Version 1.0
In this program we can either calculate the area of a circle, rectangle, or triangle
*/
import java.util.Scanner;
public class geometryCalculator {
    public static void main(String[] args) {
        //Declare variables
        double choice, radius, length, width, base, height;
        
        //Ask user which area they want to find
        Scanner getChoice = new Scanner(System.in);
        System.out.println("We will be calculating the area of a shape of your choice. "
                + "Enter 1 for circle, 2 for rectangle, or 3 for triangle");
        choice = getChoice.nextDouble();
        
        if (choice == 1) { //Choice to find circle area
            //Get radius
            Scanner getRadius = new Scanner(System.in);
            System.out.println("Enter the radius for the circle");
            radius = getRadius.nextDouble();
            
            //Print out circle area
            System.out.println(circleArea(radius));
        } else if (choice == 2){ //Choice to find rectangle area 
            //Get length
            Scanner getLength = new Scanner(System.in);
            System.out.println("Enter the length for the rectangle");
            length = getLength.nextDouble();
            
            //Get width 
            Scanner getWidth = new Scanner(System.in);
            System.out.println("Enter the width for the rectangle");
            width = getWidth.nextDouble();
            
            //Print out rectangle area
            System.out.println(rectangleArea(length, width));
        } else if (choice == 3) { //Choice to find triangle area
            //Get base
            Scanner getBase = new Scanner(System.in);
            System.out.println("Enter the base for the triangle");
            base = getBase.nextDouble();
            
            //Get height 
            Scanner getHeight = new Scanner(System.in);
            System.out.println("Enter the height for the triangle");
            height = getHeight.nextDouble();
            
            //Print out rectangle area
            System.out.println(rectangleArea(base, height));
        } else if (choice == 4) {
            System.exit(0);
        } else {
            System.out.println("Please enter a number between 1-4)");
        }
    }
    
    public static double circleArea(double radius) {
        return Math.PI*Math.pow(radius,2);
    }
    
    public static double rectangleArea(double length, double width) {
        return length * width; 
    }
    
    public static double triangleArea(double base, double height) {
        return (base*height)/2;
    }
    
}
