class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        int[] ps=new int[n+1];
        for(int i=0;i<n;i++){
            ps[i+1]=ps[i]+nums[i];
        }
        Deque<Integer> dq=new ArrayDeque<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<=n;i++){
            
            while(!dq.isEmpty() && ps[i]-ps[dq.peekFirst()]>=k){
                ans=Math.min(ans,i-dq.pollFirst());
            }
             while(!dq.isEmpty() && ps[dq.peekLast()]>=ps[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}