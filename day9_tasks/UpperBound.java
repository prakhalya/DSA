package day1;

public class UpperBound {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 12, 24, 35, 77};
        int target = 10; 
        int index = upperBound(arr, target);
        System.out.println("The upper bound index for target " + target + " is: " + index);
    }

    public static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= target) {
                left = mid + 1; 
            } else {
                right = mid;
            }
        }
        return left;
    }
}
