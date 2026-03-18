
public class linearSearch {

    public static int LS(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = {2, 4, 6, 8, 10, 12};
        int key = 10;

        int ans = LS(nums, key);

        if (ans == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at " + ans + " index!");
        }
    }
}
