class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length)
            return false;

        HashMap<String, Character> map1 = new HashMap<>();
        HashMap<Character, String> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            if (!map2.containsKey(ch) && !map1.containsKey(word)) {
                map2.put(ch, word);
                map1.put(word, ch);
            } else {
                if (!word.equals(map2.get(ch)) || map1.get(word) != ch) {
                    return false;
                }
            }
        }

        return true;
    }
}