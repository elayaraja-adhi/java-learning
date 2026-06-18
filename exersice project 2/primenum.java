import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        int a;
        int b;
        int i;
        int j;
        int flag;

        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting number :");
        a=scanner.nextInt();
        System.out.println("enter the end of the number :");
        b=scanner.nextInt();


        for(i=a;i<=b;i++){
            if (i == 1 || i==0) {
                continue;
            }

            flag = 1;

            for (j=2;j<i;j++){
                if (i % j==0) {
                    flag = 0;
                    break;
                }
            }

            if (flag==1) {
                System.out.println("Prime number is : " + i);
            }

        }

    }
}
