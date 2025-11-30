import java.util.*;
public class Create
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter to check = ");
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("found at = "+i);
            }
        }
    }
}