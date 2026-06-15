class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}