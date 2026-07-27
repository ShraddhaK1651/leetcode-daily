class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        int i=0;
        int sum=0;
        int ans=0;
        for(int j=0;j<n;j++){
            while(set.contains(nums[j])){
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }   
            set.add(nums[j]);
            sum+=nums[j];
            ans=Math.max(ans,sum);
            }
        return ans;
    }
}