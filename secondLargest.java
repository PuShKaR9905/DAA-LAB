public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {15, 22, 8, 19, 31, 7};
        int Largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Largest){
                secondLargest=Largest;
                Largest=arr[i];
            } else if (arr[i]>secondLargest && arr[i]!=Largest) {
                secondLargest=arr[i];
            }
        }
        System.out.println("Largest: "+Largest +"Second largest: "+secondLargest);
    }
}
