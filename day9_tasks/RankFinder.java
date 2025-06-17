package day1;

public class RankFinder {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 10, 10, 10, 12, 24, 35, 77};
        int target = 10;
        int rank = findRank(arr, target);
        System.out.println("The rank of element " + target + " is: " + rank);
    }
    public static int findRank(int[] arr, int target) {
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
}
