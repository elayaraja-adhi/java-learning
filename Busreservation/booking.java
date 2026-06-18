package Busreservation;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class booking {
    String passengername;
    int busno;
    Date date;


    booking(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of passangers:  ");
        passengername = scan.next();
        System.out.println("Enter the bus name:  ");
        busno = scan.nextInt();
        System.out.println("Enter the date dd-MM-yyyy");
        String Dateinput = scan.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = new Date(dateFormat.parse(Dateinput).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    public boolean isAvailable(ArrayList<booking> bookings, ArrayList<bus> buses) {
        int capacity = 0;
        for (bus bus : buses) {
            if (bus.getbusno() == busno) {
                capacity = bus.getCapacity();
                break;
            }
        }
        if (capacity == 0) {
            return false;
        }

        int booked = 0;
        for (booking b : bookings) {
            if (b.busno == busno && b.date.equals(date)) {
                booked++;
            }
        }
        return booked < capacity;
    }
}
