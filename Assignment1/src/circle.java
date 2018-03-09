/*
Program Name: circle.java
Programer: Charles
Date 02-23-18
Version 1.0
In this program we receive the raidus from the user then calculate diameter, 
circumference, and area  
*/
import java.util.Scanner;
public class circle {
    public static void main (String args []) {
        //Declaration of radius,
        double radius = 0.0, diameter, circumference, area;
        
        //Ask user for radius
        Scanner get = new Scanner(System.in);
        System.out.println("Enter radius");
        radius = get.nextDouble();
        
        //Calculate diameter
        diameter = (2*radius);

        //Calculate circumference
        circumference = (2*radius*Math.PI);
        
        //Calculate area
        area = (Math.pow(radius, 2)*Math.PI);
        
        //Output circumference
        System.out.printf("The diameter is %.2f%n", diameter);
        System.out.printf("The circumference is %.2f%n", circumference);
        System.out.printf("The area is %.2f%n", area);
    }
}
