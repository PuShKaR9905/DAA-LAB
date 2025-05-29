public class quickSort {
    public static int Partition(int[] arr,int start,int end) {
        int pivot=start;
        int count=0;

        for(int i=start+1;i<=end;i++){
            if(arr[i]<arr[pivot]){
                count++;
            }
        }
        int originalPivot=pivot+count;

        int temp=arr[pivot];
        arr[pivot]=arr[originalPivot];
        arr[originalPivot]=temp;

        int s=start,e=end;
        while(s<originalPivot && e>originalPivot){
            while(arr[s]<arr[originalPivot]){
                s++;
            }
            while(arr[e]>arr[originalPivot]){
                e--;
            }
            if(s<originalPivot && e>originalPivot){
                int temp1=arr[s];
                arr[s]=arr[e];
                arr[e]=temp1;
                s++;
                e--;
            }
        }
        
        return originalPivot;  
    }
    public static void QuickSort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int partion=Partition(arr,start,end);
        QuickSort(arr, start,partion-1);
        QuickSort(arr, partion+1, end);
        
    }
    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 32, 5, 62, 32, 14};
        System.out.println("Before Quick Sort:");
        for (int i : arr) {
            System.out.print(i + ", ");
        }

        QuickSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Quick Sort:");
        for (int i : arr) {
            System.out.print(i + ", ");
        }

    }
    
}
