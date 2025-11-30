import java.util.Scanner;
public class binomial_coefficient {
    static int fact(int n)
    {
        int f=1;
        for(int i=1; i<=n;i++)
        {
            f=f*i;
        }

    return f;
    }

    static int binoc(int nn, int r)
    {
        int fact_n=fact(nn);
        int fact_r=fact(r);
        int fact_nmr=fact(nn-r);
        int j=fact_n/(fact_r*fact_nmr);
        System.out.println("binomial_coefficient "+j);
        return 0;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n");

        int nn=sc.nextInt();
        System.out.print("Enter r");
        int r=sc.nextInt();
        binoc(nn,r);
    }

}