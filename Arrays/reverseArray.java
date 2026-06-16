public class reverseArray 
{
   public static void revArr(int arr[])
   {
    
    int i=0;
    int j=arr.length-1;

    while(i<j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        i++;
        j--;
    }
   } 
   
   public static void printArr(int arr[])
   {
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
   }
   
   public static void main(String[] args) {
       
    int arr[]={2,4,6,8};

    revArr(arr);
    printArr(arr);
   }
}
