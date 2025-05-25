public class Q9 {
    public static void main(String[] args) {
        int[] arr={5, 6, 7,1, 2, 3, 4};
        int start=0,end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        System.out.println(start);
    }
    
}
