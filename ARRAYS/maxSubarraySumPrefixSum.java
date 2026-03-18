// Prefix-Sum apporach: Big-oh(n^2)

public class maxSubarraySumPrefixSum {

    public static int MaxSubPrefixSum(int arr[]) {

        int maxSubSum = Integer.MIN_VALUE;
        // created and fill value in prefix array
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // now calculate subarray's sum to find maximum sum
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                currSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];
            }

            if (currSum > maxSubSum) {
                maxSubSum = currSum;
            }

        }

        return maxSubSum;
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10};

        System.out.println("Maximum subarray sum is: " + MaxSubPrefixSum(arr));
    }
}
