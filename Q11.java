//  Find Peak Element from an Array.

public class Q11 {

    public static int findPeakElement(int[] arr){

        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            // Check if mid is greater than its next element
            if (mid < end && arr[mid] > arr[mid + 1]) {
                end = mid; // Move to the left side
            } else {
                start = mid + 1; // Move to the right side
            }
        }
        return start; // Peak element index
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element is at index: " + peakIndex);
    }
    
}
