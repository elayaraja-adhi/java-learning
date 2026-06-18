import java.util.Scanner;


public class factorial {
 public static void main(String[] args) {
    Scanner Scan=new Scanner(System.in);
    System.out.println("Enter the factorial Number: ");

    int n=Scan.nextInt();

    int a=1;

    for(a=1;a<n;a++) {
        a=a*a;
    }
    System.out.println("the factorial Number:");
    System.out.println(a);
 }   
}
