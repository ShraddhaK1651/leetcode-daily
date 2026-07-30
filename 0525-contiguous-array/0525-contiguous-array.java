class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 occurs before the array starts
        map.put(0, -1);

        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0)
                prefixSum += -1;
            else
                prefixSum += 1;

            if (map.containsKey(prefixSum)) {
                int len = i - map.get(prefixSum);
                maxLen = Math.max(maxLen, len);
            } else {
                // Store only the first occurrence
                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }
}