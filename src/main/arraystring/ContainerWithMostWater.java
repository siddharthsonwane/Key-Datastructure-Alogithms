package main.arraystring;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        int target = 3;
        System.out.println(":"+maxArea(nums));
    }

    private static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right){
          int h = Math.min(height[left], height[right]);
          int w = right - left;
          int area = h * w;
          maxArea = Math.max(maxArea,area);

          // Move the pointer pointing to the shorter Line
            if (height[left] < height[right]){
                left ++;
            }else {
                right --;
            }

        }
        return maxArea;
    }
}
