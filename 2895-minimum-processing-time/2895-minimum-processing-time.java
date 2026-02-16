class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);
        Collections.sort(tasks, Collections.reverseOrder());
        int k=0;
        int Max=0;
        int Sum=0;
        for(int i=0; i<processorTime.size(); i++){
            int sum=0;
            int max=0;
            
            int pt=processorTime.get(i);
            int j=0;
            
            while(j<4){
                sum=pt+tasks.get(k);
                max=Math.max(sum,max);
                j++;
                k++;
            }
            Sum=max;
            Max=Math.max(Max,Sum);
        }
        return Max;
    }
}