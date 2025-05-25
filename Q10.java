// Find the starting and ending position of a given target value.

public class Q10 {

    public static int[] searchRange(int[] arr,int target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                int left=mid, right=mid;
                // Find the leftmost index
                while(left>0 && arr[left-1]==target) {
                    left--;
                }
                // Find the rightmost index
                while(right<arr.length-1 && arr[right+1]==target) {
                    right++;
                }
                return new int[]{left, right};
            }
            if (arr[mid]>target) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }

        return new int[]{-1, -1};

    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target=8;

        int[] range=searchRange(nums,target);
        System.out.println("Target found at range: " + range[0] + " to " + range[1]);
    }
    
}
