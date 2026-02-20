import java.util.Random;
public class whileloop {
    public static void main(String[] args) {
        
        Random obj = new Random();
        int newnum = 0;
        
        while (newnum!=812439578) {
            newnum = obj.nextInt(900000000);
            System.out.println(newnum);
            
        }
    }
    
}
