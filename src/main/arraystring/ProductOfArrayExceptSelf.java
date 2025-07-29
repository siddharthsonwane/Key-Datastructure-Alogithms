package main.arraystring;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = productExceptSelf(nums);
        System.out.println("Input : "+ Arrays.toString(nums));
        System.out.println("Output : "+ Arrays.toString(result));

    }

    private static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] answer = new int[n];

        //Step 1 : Build left[] array
        left[0] = 1;
        for(int i =  1; i < n; i ++){
            left[i] = left[i - 1] * nums[i - 1];
        }
        //Step 2 : Build right[] array
        right[n - 1] = 1;
        for (int i =  n - 2; i >= 0; i --){
            right[i] =  right[i + 1] * nums[i + 1];
        }
        //Step 3 : Build answer[] using left[] * right[]
        for(int i = 0; i < n; i ++){
            answer[i] = left[i] * right[i];
        }

        return answer;
    }
}
