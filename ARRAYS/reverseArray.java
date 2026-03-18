
public class reverseArray {

    // public static void swap(int a, int b) {
    //     int c;
    //     c = a;
    //     a = b;
    //     b = c;
    // }
    public static void RevArr(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            //swap(arr[i],arr[j]);
            int c;
            c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10, 12};
        RevArr(arr);
        System.out.println("Reversed Array: ");

        print(arr);
    }
}
