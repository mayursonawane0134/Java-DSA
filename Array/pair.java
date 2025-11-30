public class pair
{
    static void pppair(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            int first_pair=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print(first_pair+","+arr[j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        pppair(arr);

    }
}