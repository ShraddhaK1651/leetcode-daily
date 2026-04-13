class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int i=0;
        int f=nums[0];
        nums[k]=f;
        for(int j=1;j<nums.length;j++){
            if(nums[k]!=nums[j]){
                nums[++k]=nums[j];
            }
        }

    
        // for(k=0;k<nums.length;k++){
        //     nums[i]=nums[k];
        //     i++;
        //  }

        return k+1;
    }
}