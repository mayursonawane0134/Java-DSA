public class syntax
{
    public static int hello(int a,int b){
        System.out.println("Hello world");
        int c=a+b;
        System.out.println("c="+c);
        return c;
    };

    public static void main(String [] args)
    {
        hello(4,5);
    }
}