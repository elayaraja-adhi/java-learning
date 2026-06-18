public class fibonacci {

    public static void main(String[] args) {
        int count = 10;
        int num1=0, num2=1,result=0;
     

    System.out.print(num1+"  "+num2+"  ");

    for(int i=2;i<count;i++)
    {
        result=num1+num2;
        num1=num2;
        num2=result;
        System.out.print(result+"  ");
    }
    }
    
}
