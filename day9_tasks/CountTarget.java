package day1;

public class CountTarget {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 10, 10, 10, 12, 24, 35, 77};
        int target = 10; 
        int count = countOccurrences(arr, target);
        System.out.println("The count of target " + target + " in the array is: " + count);
    }

    public static int countOccurrences(int[] arr, int target) {
        int lowerBoundIndex = lowerBound(arr, target);
        int upperBoundIndex = upperBound(arr, target);
        return upperBoundIndex - lowerBoundIndex;
    }
    public static int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
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
