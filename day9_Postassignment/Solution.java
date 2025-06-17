package day1;

public class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        for (int w : weights) {
            left = Math.max(left, w); 
            right += w;               
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canShip(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean canShip(int[] weights, int days, int capacity) {
        int currentLoad = 0, neededDays = 1;
        for (int w : weights) {
            if (currentLoad + w > capacity) {
                neededDays++;
                currentLoad = 0;
            }
            currentLoad += w;
            if (neededDays > days) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(sol.shipWithinDays(weights, days));  
    }
}
