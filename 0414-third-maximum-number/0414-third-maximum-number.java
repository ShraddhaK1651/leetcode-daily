class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        for(int num:nums){
        if(set.contains(num))continue;

        set.add(num);
        pq.offer(num);

        if(pq.size()>3){
            pq.poll();
        }
    }
    // If we have at least 3 distinct numbers → return 3rd max
    if(pq.size()==3)
    return pq.peek();

    // Else return the maximum
    int max=Integer.MIN_VALUE;
    for(int num:pq){
        max=Math.max(max,num);
    }
    return max;

         

    }
}