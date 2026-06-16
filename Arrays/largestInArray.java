public class largestInArray 
{

    public static int findLargestNum(int arr[])
    {
        int maxNum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxNum)
            {
                maxNum=arr[i];
            }
        }
        return maxNum;
    }

    public static void main(String args[])
    {
        int arr[] = {3,21,45,32,29};

        int ans = findLargestNum(arr);

        System.out.println("Largest number in the given array is: " + ans);
    }
}
