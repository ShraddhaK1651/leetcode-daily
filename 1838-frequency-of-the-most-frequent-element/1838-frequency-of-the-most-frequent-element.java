class Solution {
    public int maxFrequency(int[] nums, int k) {

        // Step 1: Sort the array
        Arrays.sort(nums);

        int left = 0;
        int ans = 1;

        // Sum of the current window
        long sum = 0;

        // Expand the window
        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            // Cost to make every element equal to nums[right]
            while ((long) nums[right] * (right - left + 1) - sum > k) {

                // Shrink the window
                sum -= nums[left];
                left++;
            }

            // Current window is valid
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}