package main.arraystring;

public class TrappingRainWater {
    public static void main(String[] args) {
       int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        TrappingRainWater tpw = new TrappingRainWater();
        System.out.println(tpw.traWater(height));
    }

    private int traWater(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int water =  0;

        while (left < right){
            if (height[left] < height[right]){
                if (height[left] >= leftMax){
                    leftMax = height[left];
                }else {
                    water += leftMax - height[left];
                }
                left ++;
            }else {
                if (height[right] >= rightMax){
                    rightMax = height[right];
                }else {
                    water += rightMax - height[right];
                }
                right --;
            }
        }

        return water;
    }
}
/*
[0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
 */