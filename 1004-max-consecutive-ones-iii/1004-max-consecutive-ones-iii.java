class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int r=0;
        int maxCnt=0;
        while(r<n){
         if(nums[r]==0){
            k--;
         }
         while(k<0){
            if(nums[l]==0){
                k++;
            }
            l++;
         }
        maxCnt=Math.max(maxCnt,r-l+1);
        r++;
        }
        return maxCnt;
    }

}
