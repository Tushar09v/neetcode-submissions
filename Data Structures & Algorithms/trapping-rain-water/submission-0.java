class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int leftMax = height[0];
        int rightMax = height[n-1];
        int water = 0;

        while(left < right){
            if(height[left] < height[right]){
                left++;
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
            }else{
                right--;
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
            }
        }
        return water;
    }
}
