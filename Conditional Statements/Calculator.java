import java.util.*;
public class Calculator  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No 1: ");
        int no1 = input.nextInt();
        System.out.print("Enter No 2: ");
        int no2 = input.nextInt();
        System.out.print("a for Addition    s for subtraction   d for Division  m for Multiplication");
        char Select = input.next().charAt(0);
        switch(Select){
            case 'a':
                System.out.print(no1+no2);
                break;
            case 's':
                System.out.print(no1-no2);
                break;
            case 'd':
                System.out.print(no2/no1);
                break;
            case 'm':
                System.out.print(no1*no2);
                break;
            default:



        }

    }
}