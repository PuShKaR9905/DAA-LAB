public class mergeSort {
    public static void mergeArray(int[] arr,int start,int mid,int end){
        // size of sub array
        int n1=mid-start+1;
        int n2=end-mid;
        // create a temprory array
        int[] left=new int[n1];
        int[] right=new int[n2];
        //copy data to array
        for(int i=0;i<n1;i++){
            left[i]=arr[start+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=start;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }
    public static void MergeSort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        MergeSort(arr, start, mid);
        MergeSort(arr,mid+1,end);
        mergeArray(arr,start,mid,end);
    }
    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 32, 5, 62, 32, 14};
        System.out.println("\nBefore merge Sort:");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        MergeSort(arr,0,arr.length-1);
        System.out.println("\nAfter Merge Sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    } 
}
