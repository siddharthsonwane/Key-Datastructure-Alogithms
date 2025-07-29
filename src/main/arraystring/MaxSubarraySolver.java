package main.arraystring;

public class MaxSubarraySolver {
    public static void main(String[] args) {
        MaxSubarraySolver solver = new MaxSubarraySolver();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

      //  int kadaneResult = solver.maxSubArrayKadane(nums);
        int divideResult = solver.maxSubArrayDivideAndConquer(nums);
        System.out.println(divideResult);
    }

    private int maxSubArrayDivideAndConquer(int[] nums) {
        return maxSubArrayHelper(nums,0,nums.length - 1);
    }

    private int maxSubArrayHelper(int[] nums, int left, int right) {
        if (left == right) return nums[left]; // base case

        int mid = left + (right - left) / 2;

        int leftSum = maxSubArrayHelper(nums, left, mid);
        int rightSum = maxSubArrayHelper(nums, mid + 1, right);
        int crossSum = maxCrossingSum(nums, left, mid, right);

        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }
    private int maxCrossingSum(int[] nums, int left, int mid, int right) {
        int leftMax = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= left; i--) {
            sum += nums[i];
            if (sum > leftMax) leftMax = sum;
        }

        int rightMax = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum += nums[i];
            if (sum > rightMax) rightMax = sum;
        }
        return leftMax + rightMax;
    }


    //Method 1 : kadane's Algorithms (O(n))
    private int maxSubArrayKadane(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
