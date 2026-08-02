class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];

        // Count magazine letters
        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']++;
        }

        // Remove letters used by ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            int idx = ransomNote.charAt(i) - 'a';

            if (freq[idx] == 0)
                return false;

            freq[idx]--;
        }

        return true;
    }
}