class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int totSum=0;
        for(int num:nums){
            totSum+=num;
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            int rightSum=totSum-leftSum-nums[i];
            if(rightSum==leftSum)return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}