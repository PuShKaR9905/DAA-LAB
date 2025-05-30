public class heapsort {
    public static void heapify(int[] arr,int n,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n && arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr, n, largest);

        }
    }
    public static void heapSort(int[] arr){
        int size=arr.length;
        // make maxheap
        for(int i=size/2+1;i>=0;i--){
            heapify(arr,size,i);
        }
        for(int i=size-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }
    }
    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 32, 5, 62, 32, 14};
        System.out.println("\nBefore heap Sort:");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        heapSort(arr);
        System.out.println("\nAfter heap Sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
