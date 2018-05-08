/*
Program Name: hotelOccupany.java
Programer: Charles Ibo
Date 04-20-18
Version 1.0
In this program we ask the user the number of floors are in the hotel,
how many rooms on each floor,
and how many rooms are occupied. Then it calculates the occupancy rate for the hotel
*/
import java.util.Scanner;
public class hotelOccupany {
    public static void main(String[] args) {
        //Declare variables
        int floorCount = 1, roomCount = 0, roomOccupancy = 0, 
                totalOccupancy = 0, totalRoomCount = 0;
        Scanner getFloor = new Scanner(System.in);
        System.out.println("Please enter the number of floors in the hotel: ");
        floorCount = (int) getFloor.nextDouble();
        
        for(int i = 1; i <= floorCount; i++) {
            Scanner getRoom = new Scanner(System.in);
            System.out.println("Enter the number rooms on floor number " + i + 
                    " : ");
            roomCount = (int) getRoom.nextDouble();
            totalRoomCount = totalRoomCount + roomCount;
            
            Scanner getOccupancy = new Scanner(System.in);
            System.out.println("Enter the number rooms on floor number " + i + 
                    " that are occupied: ");
            roomOccupancy = (int) getOccupancy.nextDouble();
            totalOccupancy = totalOccupancy + roomOccupancy;
        }
        
        System.out.println("There are " + floorCount + " available floors in the hotel");
        System.out.println("There are " + totalRoomCount + " rooms in the hotel");
        System.out.println("There are " + totalOccupancy + " occupied rooms in the hotel");
        System.out.println("There are " + (totalRoomCount - totalOccupancy) + " rooms unoccupied");
        System.out.println("There are " + percentOccupied(totalOccupancy, totalRoomCount) 
                + "% rooms being occupied right now" );
    }
    public static double percentOccupied(double totalOccupancy, double totalRoomCount) {
        return 100*(totalOccupancy/totalRoomCount);
    }
}
