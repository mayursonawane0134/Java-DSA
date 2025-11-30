import java.util.Scanner;
public class IncomeTax
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Salary");
        int Salary=sc.nextInt();

        if(Salary<=400000)
        {
            System.out.print("You Don't have to pay tax");
        }

        else if(Salary>=400001 && Salary<=800000)
        {
            float Tax=Salary*0.05f;
            System.out.println("You have to pay tax "+Tax);
            System.out.println(" After pay Tax remeaning amount is "+(Salary-Tax));
        }

        else if( Salary>=800001 && Salary<=1200000)
            {
            float Tax=Salary*0.10f;
            System.out.println("You have to pay tax "+Tax);
            System.out.println(" After pay Tax remeaning amount is "+(Salary-Tax));
            }

        else if( Salary>=1200001 && Salary<=1600000)
        {
            float Tax=Salary*0.15f;
            System.out.println("You have to pay tax "+Tax);
            System.out.println(" After pay Tax remeaning amount is "+(Salary-Tax));
        }

        else if( Salary>=1600001 && Salary<=2000000)
        {
            float Tax=Salary*0.20f;
            System.out.println("You have to pay tax "+Tax);
            System.out.println(" After pay Tax remeaning amount is "+(Salary-Tax));
        }

        else if( Salary>=2000001 && Salary<=2400000)
        {
            float Tax=Salary*0.25f;
            System.out.println("You have to pay tax "+Tax);
            System.out.println(" After pay Tax remeaning amount is "+(Salary-Tax));
        }

        else if( Salary>=2400001 )
        {
            float Tax=Salary*0.30f;
            System.out.println("You have to pay tax "+Tax);
            System.out.println(" After pay Tax remeaning amount is "+(Salary-Tax));
        }

    }
}