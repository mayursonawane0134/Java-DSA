import java.util.Scanner;
public class While
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        int a=1;
        while(a<=10)
        {
            System.out.println(num+" x "+a+" = "+(num*a));
            a++;


        }
    }
}