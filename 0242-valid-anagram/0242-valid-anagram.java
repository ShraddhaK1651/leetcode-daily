class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] freq=new int[26];
        for(char S:s.toCharArray()){
            freq[S-'a']++;
        }
        for(char T:t.toCharArray()){
            freq[T-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0)return false;
        }
        return true;
    }
}