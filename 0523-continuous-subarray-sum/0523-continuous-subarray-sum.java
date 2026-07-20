class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int ps=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            ps+=nums[i];
            int rem=ps%k;
            if(rem<0)rem+=k;
            if(map.containsKey(rem)){
                if(i-map.get(rem)>1)
                return true;
            }else{
                map.put(rem,i);
            }

        }
        return false;
        
    }
}