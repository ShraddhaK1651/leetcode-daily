class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {

            String s = String.valueOf(num);

            for (char ch : s.toCharArray()) {
                ans.add(ch - '0');
            }
        }

        return ans.stream().mapToInt(i -> i).toArray();
    }
}
    