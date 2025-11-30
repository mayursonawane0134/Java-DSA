import java.util.Scanner;
public class Fibo {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        int a=0;
        int b=1;
        while(count<=n)
        {
            int sum=a+b;
            a=b;
            b=sum;
            System.out.println(sum+ " ");
            count++;
        }
    }
}