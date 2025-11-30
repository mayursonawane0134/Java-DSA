import java.util.Scanner;
public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 =");
        int a =sc.nextInt();
        System.out.print("Enter number 2 =");
        int b= sc.nextInt();
        System.out.print("Enter number 3 =");
        int c=sc.nextInt();

     /*   if (a>b)
        {
            System.out.println("Number 1 is largeer"+a);
        }
        else if(b>c)
        {
            System.out.println("Number 2 is largeer"+b);
        }
        else
        {
            System.out.println("Number 3 is largeer"+c);
        }*/

        if (a>b&&a>c)
            {
            System.out.println(" Number 1 is large " +a);
            }
        else if(b>a && b>c)
        {
            System.out.println(" Number 2 is large " +b);
        }

        else
        {
            System.out.println(" Number 3 is large " +c);
        }

    }
}