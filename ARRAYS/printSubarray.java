
public class printSubarray {

    public static void PS(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("[");
                for (int start = i; start <= j; start++) {
                    System.out.print(arr[start] + " ");
                }
                System.out.print("] ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String args[]) {

        int arr[] = {2, 4, 6, 8, 10};
        PS(arr);
    }
}
