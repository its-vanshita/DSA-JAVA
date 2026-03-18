
public class largestNum {

    public static int getMax(int arr[]) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    public static void main(String args[]) {
        int arr[] = {1, 3, 6, 7, 5};

        int max = getMax(arr);

        System.out.println("Maximum value in the given array is: " + max);
    }
}
