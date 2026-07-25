class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> window=new HashSet<>();
        for(int i=0;i<n;i++){
            if(i>k){
            window.remove(nums[i-k-1]);
            }
            if(!window.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}