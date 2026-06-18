package atmprojects;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        int balance = 1000000 , withdraw , deposit;
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Automated tellar Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for checkbalance");
            System.out.println("Choose the oparation you want to perfors from above :");

            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter money to be withdraw :");
                    withdraw=scan.nextInt();
                    if(balance>= withdraw) {
                        balance=balance-withdraw;
                        System.err.println("please enter your money");
                    }
                    else {
                        System.out.println("Insufficiant balance");
                    }
                    
                    break;

                case 2 : 
                System.out.println("Enter money to be deposited :");
                deposit = scan.nextInt();
                balance=balance+deposit;
                System.out.println("your money has been successfully deposite");
                System.out.println("");

                break;
                
                case 3:
                System.out.println("Your balance is: " + balance);
                break;

                case 4 :
                    System.out.println(0);
            }
        }
    }
}
