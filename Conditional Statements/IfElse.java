import java.util.*;
public class IfElse  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number n");
        int n=sc.nextInt();
       // System.out.println("enter a number m");
       // int m=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}