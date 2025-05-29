public class binarySerch {
    public static boolean serchTarget(int[] arr,int start,int end,int target){
        if(start>end){
            return false;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return true;
        }
        if(arr[mid]>target) {
            return serchTarget(arr, start, mid-1, target);
        } else {
            return serchTarget(arr,mid+1, end, target);
        }

    }
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target=5;
        int s=0,e=arr.length;
        boolean ans=serchTarget(arr,s,e,target);
        System.out.println(ans); 
    } 
}
