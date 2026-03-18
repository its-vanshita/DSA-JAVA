// Brute-force approach: Big-Oh(n^3)

public class maxSubarraySumBruteForce {

    public static int MSS(int arr[]) {
        int maxSubSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int subSum = 0;
                for (int start = i; start <= j; start++) {
                    subSum += arr[start];
                }
                if (subSum > maxSubSum) {
                    maxSubSum = subSum;
                }
            }
        }

        return maxSubSum;
    }

    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 10};

        System.out.print("Maximum subarray sum is: " + MSS(arr));

    }
}
