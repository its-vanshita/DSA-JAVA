public class printAllSubarrays 
{
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                System.out.print("[");   // Opening bracket

                for(int start=i;start<=j;start++)
                {
                    System.out.print(arr[start]);

                    if(start < j)       // Print comma except after last element
                    {
                        System.out.print(", ");
                    }
                }

                System.out.print("] "); // Closing bracket and space
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int arr[] = {2,4,6,8,10};
        print(arr);
    }
}