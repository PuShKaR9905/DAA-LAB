public class Q8 {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target=10;
        // linaer search
        for(int i:arr){
            if(i==target){
                System.out.println("Element found");
                break;
            }
        }
        // binary search
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                System.out.println("Element fount using binary search");
                break;
            }
            if (arr[mid]>target) {
                right=mid-1;
            } else {
                left=mid+1;
            }
        }

    }
    
}
