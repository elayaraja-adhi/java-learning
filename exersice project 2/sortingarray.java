public class sortingarray {
    public static void main(String[] args) {
        int arr[] = {8,5,4,3,9};
        System.out.print("The original Array : ");

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + "  ");
         
        int temp=0;
        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++)
                if (arr[j]<arr[i]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
        System.out.println("The Sorted Array : ");

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + "  ");

    }
}
