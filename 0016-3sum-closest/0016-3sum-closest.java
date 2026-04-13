class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
         int mindiff=Integer.MAX_VALUE;
         int sum=0;
         int closestSum=0;
        for(int i=0;i<nums.length;i++){
            
            int diff=0;
            int left=i+1;
            int right=nums.length-1;
            while( left < right ){
            sum=nums[i]+nums[left]+nums[right];
            diff=Math.abs(sum-target);
           
            if(diff<mindiff){
                mindiff=diff;
                closestSum=sum;
            }
            if(sum<target)left++;
            else if(sum>target)right--;
            else return target;

            }
            
        }
        return closestSum;
    }
}