class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        int n=nums.length;
        int K=k%n;
        if(k==0)return;
        int i=0;
        int j=0;
        for(j=n-K;j<n;j++){
            arr[i++]=nums[j];
        }
        for(j=0;j<n-K;j++){
            arr[i++]=nums[j];
        }
        for(i=0;i<n;i++) {
            nums[i]=arr[i];
    }
}
}