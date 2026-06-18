package Busreservation;

import java.util.Scanner;

public class palindrom1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        int org =num;
        int rev=0;


        while (num !=0) {
            rev = rev*10 + num%10;
            num=num/10;
        }

        System.out.println(rev);

        if(org==rev){
            System.out.println("This number is a palindrom !!!");
        }
        else{
            System.out.println("This number is a  Not palindrom !!!");
        }



    }
    
}
