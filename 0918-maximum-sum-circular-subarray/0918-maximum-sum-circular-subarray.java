class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int totSum=0;

        int currMax=0;
        int maxSum=nums[0];

        int currMin=0;
        int minSum=nums[0];

        for(int i=0;i<n;i++){
            currMax=Math.max(nums[i],currMax+nums[i]);
            maxSum=Math.max(currMax,maxSum);

            currMin=Math.min(nums[i],currMin+nums[i]);
            minSum=Math.min(currMin,minSum);

            totSum+=nums[i];
        }
        if(maxSum<0)return maxSum;
        return Math.max(maxSum,totSum-minSum);


    }
}