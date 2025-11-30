import java.util.*;
 public class New_Try
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter size of array = ");
      int a=sc.nextInt();
      //System.out.println( " ");
      int array[] = new int[a];
      int sum=0;
      for (int i=0;i<a;i++)
      {
          int l=sc.nextInt();
          sum+=l;
         array[i]=sum;
      }

      for(int i=0;i<array.length;i++)
      {
          System.out.print(array[i]+" ");
      }

    }
}