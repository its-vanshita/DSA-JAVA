/*
Optimized approach of maximum subarray sum:

Time-Complexity: O(n)
Space-Complexity: O(1)


In basic kadane's algo it doesn't handle the case where all the numbers in the array will negative. In that case we can do two things:

(i) We can check by traversing the array that all elements are negative or not. If yes then we will return maximum element of the array. (This approach will not increase the time or space complexity but we are using loop two times in this approach that's why it is becoming little slower so we will not use this approach everytime.)

(ii) Standard kadane
*/


public class kadaneAlgo
{
    public static int basicKadane(int arr[])
    {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            currSum += arr[i];

            if(currSum<0)
            {
                currSum=0;
            }

            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }


    public static int standardKadance(int arr[])  // Handles array with all negative values
    {
        int currSum=0;
        int maxSum=0;

        for(int i=0;i<arr.length;i++)
        {
           currSum=Math.max(arr[i],currSum+arr[i]);
           maxSum=Math.max(currSum,maxSum);
        }

        return maxSum;

    }


    public static void main(String args[])
    {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int ans = standardKadance(arr);


        System.out.println("Maximum subarray sum in the given array is: "+ans);


    }
}