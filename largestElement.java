public class largestElement {
    public static void main(String[] args) {
        int[] arr = {15, 22, 8, 19, 31, 7};
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("largest element is: "+largest);
    }
}
