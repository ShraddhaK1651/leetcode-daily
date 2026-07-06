class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int cnt=1;
        int ele=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==ele){
                cnt++;
            }
            else if(nums[i]!=ele && cnt>0){
                cnt--;
            }
            else{
                ele=nums[i];
                cnt=0;
            }
        }
        int count=0;
        for(int k=0;k<n;k++){
            if(nums[k]==ele)count++;
        }
        if(count>=n/2)return ele;
        return -1;
    }
}