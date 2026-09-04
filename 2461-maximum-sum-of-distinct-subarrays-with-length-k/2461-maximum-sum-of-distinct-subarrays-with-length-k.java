import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int dups = 0;
        long sum = 0;
        long max = 0;

        // First window
        for (int i = 0; i < k; i++) {

            if (map.containsKey(nums[i])) {
                dups++;
            }

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            sum = sum + nums[i];
        }

        if (dups == 0) {
            max = sum;
        }

        // Sliding window
        for (int i = k; i < nums.length; i++) {

            int numToAdd = nums[i];
            int numToRemove = nums[i - k];

            if (map.get(numToAdd) != null) {
                if (map.get(numToAdd) > 0) {
                    dups++;
                }
            }

            map.put(numToAdd, map.getOrDefault(numToAdd, 0) + 1);

            sum = sum + numToAdd;

            if (map.get(numToRemove) > 1) {
                dups--;
            }

            map.put(numToRemove, map.get(numToRemove) - 1);

            sum = sum - numToRemove;

            if (dups == 0) {
                max = Math.max(sum, max);
            }
        }

        return max;
    }
}