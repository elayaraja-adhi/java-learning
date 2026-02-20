import java.util.Scanner;
public class ifelse {

        public static void main(String[] args) {
                
                try (Scanner obj = new Scanner(System.in)) {
                        float num = obj.nextFloat();
                        if(num<7.4){
                                System.out.println("Scholarship is available");
                        }
                        else{
                                System.out.println("not eligible for scholarship");
                        }
                }
        }

        public ifelse() {
        }
}