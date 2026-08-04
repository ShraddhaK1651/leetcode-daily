class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int len = n / 2; len >= 1; len--) {

            if (n % len == 0) {

                int times = n / len;
                String pattern = s.substring(0, len);

                StringBuilder newStr = new StringBuilder();

                while (times-- > 0) {
                    newStr.append(pattern);
                }

                if (newStr.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }
}