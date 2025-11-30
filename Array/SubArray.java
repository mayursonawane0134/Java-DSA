public  class SubArray
{
    static void Array(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                int sum=0;
                sum +=arr[k];
                arr[k]=sum;
                System.out.println(" sum = "+ arr[k]);
            }
            System.out.println(" ");
        }
        return ;
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,};
        Array(arr);
    }
}