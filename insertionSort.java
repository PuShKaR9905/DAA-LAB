public class insertionSort {
    public static void inerstionsort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j+1]<arr[j]){
                    // Swap the elements
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                } else {
                    // If the current element is in the correct position, break the inner loop
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={64, 25, 12, 22, 11};
        inerstionsort(arr);
        System.out.println("Sorted array: ");
        for(int num:arr){
            System.out.print(num+",");
        }
    }
}
