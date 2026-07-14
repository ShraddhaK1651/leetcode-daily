class Solution {
    public int minSteps(String s, String t) {

        int[] freq = new int[26];

        // Count characters of s
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Match characters from t
        for (char c : t.toCharArray()) {
            if (freq[c - 'a'] > 0) {
                freq[c - 'a']--;
            }
        }

        // Remaining characters are missing
        int ans = 0;

        for (int x : freq) {
            ans += x;
        }

        return ans;
    }
}