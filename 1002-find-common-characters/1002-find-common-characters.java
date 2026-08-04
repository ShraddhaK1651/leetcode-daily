class Solution {
    public List<String> commonChars(String[] words) {
        int[] freq = new int[26];

        // Count frequency of characters in the first word
        for (int i = 0; i < words[0].length(); i++) {
            char ch = words[0].charAt(i);
            freq[ch - 'a']++;
        }

        // Compare with every other word
        for (int j = 1; j < words.length; j++) {
            int[] freq1 = new int[26];

            // Count frequency of current word
            for (int i = 0; i < words[j].length(); i++) {
                char ch = words[j].charAt(i);
                freq1[ch - 'a']++;
            }

            // Keep the minimum frequency
            for (int k = 0; k < 26; k++) {
                freq[k] = Math.min(freq[k], freq1[k]);
            }
        }

        // Build the answer
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                ans.add(String.valueOf((char) (i + 'a')));
                freq[i]--;
            }
        }

        return ans;
    }
}