class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int[] freq=new int[26];
        int maxfreq=0;
        int left=0;
        int ans=0;
        for(int right=0;right<n;right++){
            freq[s.charAt(right)-'A']++;
        
        maxfreq=Math.max(maxfreq,freq[s.charAt(right)-'A']);
        while((right-left+1)-maxfreq > k){
            freq[s.charAt(left)-'A']--;
            left++;
        }
        ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}