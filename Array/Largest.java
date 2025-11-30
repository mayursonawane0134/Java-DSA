public class Largest
{
    public static void main(String[] args)
    {
        int array[]={10,54,85,35,52,16,39,65};


        for(int i=0;i< array.length;i++)
        {
            System.out.println(array[i]+" ");
        }

        int large=Integer.MIN_VALUE;
        for (int i=0;i< array.length;i++)
        {
            if(large<array[i])
            {
                large=array[i];

            }
        }

        System.out.println("Large no from array = "+large);
    }
}