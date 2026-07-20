class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftsum=new int[nums.length];
        int[] rightsum=new int[nums.length];
        leftsum[0]=0;
        rightsum[nums.length-1]=0;
        int totsum=0;
        for(int num:nums){
            totsum+=num;
        }
        for(int i=1;i<nums.length;i++){
            leftsum[i]=nums[i-1]+leftsum[i-1];
        }
        for(int i=0;i<nums.length-1;i++){
            rightsum[i]=totsum-leftsum[i]-nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return nums;
    }
}