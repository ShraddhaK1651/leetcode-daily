class Solution {
    public int stoneGameVIII(int[] stones) {

        int n = stones.length;

        // prefix sum
        int[] prefix = new int[n];

        prefix[0] = stones[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + stones[i];
        }

        // Initially, Alice takes all stones
        int ans = prefix[n - 1];

        // We can choose prefix ending at i
        // i must be at least 1 because at least 2 stones
        for (int i = n - 2; i >= 1; i--) {

            ans = Math.max(ans, prefix[i] - ans);
        }

        return ans;
    }
}