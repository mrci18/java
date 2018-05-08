/*
Program Name: doublePenny.java
Programer: Charles Ibo
Date 04-20-18
Version 1.0
In this program we calculates how much a person would earn over a period of time 
if his or her salary is one penny the first day and two pennies the second day, 
and continues to double each day
*/
import java.util.Scanner;
public class doublePenny {
    public static void main(String[] args) {
        // Declare variables
        int days; 
        double salary = 0.01;
        double total = 0.00;
        
        Scanner getDays = new Scanner(System.in);
        System.out.println("Please enter the number of days you worked: ");
        days = getDays.nextInt();
        System.out.println(days);
        
        if(days >= 1){
            for(int i = 1; i <= days; i++){
                System.out.println("Your salary " + " for day " + i 
                        + " is: $" + salary);
                total = total + salary;
                if (days > 1){
                    salary *= 2;
                }
            }
        } else {
            salary = 0;
            System.out.println("Your salary is: $" + salary + " because you did not work enough");
            }
        System.out.println("Your total salary is: $" + total);
            
        }           
    }

