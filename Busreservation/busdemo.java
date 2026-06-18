package Busreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class busdemo {
    public static void main(String[] args) {

         ArrayList<bus> buses = new ArrayList<bus>();
         ArrayList<booking> bookings = new ArrayList<booking>();
         
        buses.add(new bus(1,true,3));
        buses.add(new bus(2,false,2));
        buses.add(new bus(3,true,5));

        


        int userOpt=1;
        Scanner Scan=new Scanner(System.in);

        for(bus b : buses) {
            b.displayBusinfo();
        }


        while (userOpt==1) {
            System.out.println("Enter 1 to Book and 2 to Exit !!");
            userOpt=Scan.nextInt();
            if(userOpt==1){
                booking booking = new booking();
                // call helper isAvailable in this class
                if (isAvailable(buses, bookings)) {
                    // add the new booking to the bookings list
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed....!!!");
                }
                else
                    System.out.println("Sorry.Not Availabe in bus or date.");
            }
        }
    }

    private static boolean isAvailable(ArrayList<bus> buses, ArrayList<booking> bookings) {
        return !buses.isEmpty();
    }

}
