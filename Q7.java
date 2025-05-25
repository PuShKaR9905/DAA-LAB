public class Q7 {
    static void moveZero(int[] arr){
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                // Swap the elements
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            else{
                // If the current element is zero, do nothing
                // Just continue to the next iteration
            }
        }
        
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZero(nums);
        for(int i:nums){
            System.out.print(i+",");
        }
    }
    
}
