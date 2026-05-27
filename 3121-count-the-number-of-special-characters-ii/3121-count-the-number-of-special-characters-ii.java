class Solution {
    public int numberOfSpecialChars(String word) {
       int[] lower = new int[26];
        int[] upper = new int[26];

        // Store positions
        for (int i = 0; i < 26; i++) {
            lower[i] = -1;
            upper[i] = -1;
        }

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {
                lower[ch - 'a'] = i; // latest lowercase position
            } else {
                if (upper[ch - 'A'] == -1) {
                    upper[ch - 'A'] = i; // first uppercase position
                }
            }
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (lower[i] != -1 && upper[i] != -1 &&
                lower[i] < upper[i]) {
                count++;
            }
        }

        return count;
    }
}