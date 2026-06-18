public class patter1 {
    public static void main(String[] args) {

        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
               // if(i==0 || i==3 || j==0 || j==3)
                System.out.print("*");
                // else
                System.out.print(" ");

            }
            System.out.println();
        }
         
    }
}
