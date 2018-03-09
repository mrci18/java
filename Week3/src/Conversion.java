/*
Program Name: Conversion.java
Programer: Charles
Version 1.0
In this program we get F degreees from the user then we convert to C degrees
*/
import java.util.Scanner;
public class Conversion {
    public static void main (String args []) {
        //Declaration section
        double f = 0.0, c= 0.0;
        
        //Ask user for F degrees
        Scanner get = new Scanner(System.in);
        System.out.println("Enter F degrees");
        f = get.nextDouble();
        
        //Here we convert f degree to c degree
        c = (5.0/9.0) * (f-32);
        
        //Output section
        //%.2f 2 decimals after
        //%n Print new line
        System.out.printf("The celcius degreess is %.2f%n", c);
    }
}
