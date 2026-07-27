class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n=s.length();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            ans[i]=Math.abs(ch1-ch2);
        }
        int left=0;
        int sum=0;
        int max=0;
        for(int right=0;right<n;right++){
            sum+=ans[right];
            while(sum>maxCost){
                sum-=ans[left];
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}