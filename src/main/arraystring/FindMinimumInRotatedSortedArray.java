package main.arraystring;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums ={11,13,15,17};
        System.out.println(":"+findMin(nums));
    }

    private static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right){
            int mid = left + (right - left) / 2;

            if (nums[mid]  > nums[right]){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return nums[left];
    }
}
