import java.util.Scanner;
public class Prime
{
    static boolean prime(int n){
        boolean isPrime=true;
        for(int i=2;i<n;i++)
            if(n%i==0)
            {
                isPrime=false;
            }

        //System.out.println(isPrime);
        return isPrime;
    }

    static void range(int n)
    {
        for(int i =2 ;i<=n;i++)
        {
            if(prime(i))
            {
                System.out.println(i);
            }
        }
        return;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no to check it prime or not : ");
        int n=sc.nextInt();
        range(n);

    }
}