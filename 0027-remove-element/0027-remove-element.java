class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int i=0;
        int cnt=0;
        for(int j=0;j<n;j++){
            if(nums[j]!=val){
                cnt++;
                nums[i]=nums[j];
                i++;
            }
            }
        return i;
    }
}