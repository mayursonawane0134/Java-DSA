import java.util.Scanner;
public class Overloading
{
    static int Add(int a, int b)
    {
        int c= a+b;
        System.out.println("Addition of int No = "+c);
        return c;
    }

    static float Add(float a, float b)
    {
        float g=a+b;
        System.out.println("Addition of float is = "+g);
        return g;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter int no1 \n");
        int a=sc.nextInt();
        System.out.print("Enter int no2\n");
        int b=sc.nextInt();

        System.out.print("Enter float no1 \n");
        float d=sc.nextFloat();
        System.out.print("Enter float no2 \n");
        float e=sc.nextFloat();

        Add(a,b);
        Add(d,e);
    }
}