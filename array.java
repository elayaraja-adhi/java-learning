import java.util.Scanner;
public class array{
    public static void main(String args[]) {
        int[] num = new int[5];

        Scanner obj = new Scanner(System.in);
        
        num[0]=obj.nextInt();
        num[1]=obj.nextInt();
        num[2]=obj.nextInt();
        num[3]=obj.nextInt();
        num[4]=obj.nextInt();

        System.out.println(num[0]+num[1]+num[2]+num[3]+num[4]);

       
        
    }
}