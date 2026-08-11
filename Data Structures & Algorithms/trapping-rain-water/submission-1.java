class Solution {
    public int trap(int[] height) {
     int n = height.length;
     int l = 0;
     int r = n-1;
     int rMax = height[n-1];
     int lMax = height[0];
     int water = 0;

     while(l < r){
        if(height[l] < height[r]){
            l++;
            lMax = Math.max(lMax, height[l]);
            water += lMax - height[l];
        }else{
            r--;
            rMax = Math.max(rMax, height[r]);
            water += rMax - height[r];
        }
     } 
     return water;  
    }
}
