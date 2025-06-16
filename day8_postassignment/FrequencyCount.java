package day1;

public class FrequencyCount {
    public static int findFirst(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int firstIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                firstIndex = mid; 
                right = mid - 1; 
            } else if (arr[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
       return firstIndex;
    }
    public static int findLast(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int lastIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                lastIndex = mid; 
                left = mid + 1; 
            } else if (arr[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return lastIndex;
    }
    public static int countFrequency(int[] arr, int target) {
        int firstIndex = findFirst(arr, target);
        int lastIndex = findLast(arr, target);

        if (firstIndex == -1 || lastIndex == -1) {
            return 0; 
        }
        return lastIndex - firstIndex + 1; 
    }
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int frequency = countFrequency(sortedArray, target);
        System.out.println("Frequency of " + target + " is: " + frequency);
    }
}
