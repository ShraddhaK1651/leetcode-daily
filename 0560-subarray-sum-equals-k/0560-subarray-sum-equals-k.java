class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int ps=0;
        int cnt=0;
        map.put(0,1);
        for(int num:nums){
            ps+=num;
            if(map.containsKey(ps-k)){
                cnt+=map.get(ps-k);
            }
            map.put(ps,map.getOrDefault(ps,0)+1);
        }
        return cnt;
    }
}