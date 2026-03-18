// Optimal Approach: Big-oh(n)

public class maxSubarraySumKadane {

    public static int MaxSubSumOptimal(int arr[]) {
        int currSum = 0;
        int maxSubSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            currSum += arr[i];

            if (currSum < 0) {
                currSum = 0;
            }

            if (currSum > maxSubSum) {
                maxSubSum = currSum;
            }
        }
        return maxSubSum;
    }

    public static void main(String args[]) {

        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.print("Maximum subarray sum is: " + MaxSubSumOptimal(arr));
    }
}
