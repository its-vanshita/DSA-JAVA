// in binary search array should be sorted

public class binarySearch 
{
        public static int BS(int arr[],int key)
        {
            int start = 0;
            int end = arr.length -1;

            while(start<=end)
            {
                int mid = start + (end-start)/2;

                if(arr[mid]==key)
                {
                    return mid;
                }

                else if(arr[mid]>key)
                {
                    end = mid-1;
                }

                else
                {
                    start = mid + 1;
                }

            }
            return -1;
        }   
        
        
        public static void main(String args[])
        {
            int arr[]={2,4,6,8,10,12,14};
            int key = 10;

            int ans = BS(arr,key);


            if(ans == -1)
            {
                System.out.println(key + " is not present in the array.");
            }
            else
            {
                System.out.println(key + " is present at index: " + ans);
            }
            

        }
}
