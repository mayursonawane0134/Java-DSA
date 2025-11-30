public class Max_Sub_Array_Sum
{
    static int sum(int array[])
    {
        int currentsum=0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i< array.length;i++)
        {
            for(int j=i;j< array.length;j++)
            {   currentsum=0;
                for (int k=i;k<=j;k++)
                {
                    currentsum+=array[k];
                }
                if(MaxSum<currentsum)
                {
                    MaxSum=currentsum;
                }
            }
        }
        return MaxSum;
    }

    public static void main(String[] args)
    {
        int array[]={1,2,3,4,5};
        System.out.println(sum(array));

    }
}