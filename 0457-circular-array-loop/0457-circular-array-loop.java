class Solution {

    public boolean circularArrayLoop(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                continue;
            }

            boolean forward = nums[i] > 0;

            int slow = i;
            int fast = i;

            while (true) {

                // Slow moves one step
                slow = nextIndex(nums, slow, forward);

                if (slow == -1) {
                    break;
                }

                // Fast moves one step
                fast = nextIndex(nums, fast, forward);

                if (fast == -1) {
                    break;
                }

                // Fast moves second step
                fast = nextIndex(nums, fast, forward);

                if (fast == -1) {
                    break;
                }

                // Cycle found
                if (slow == fast) {
                    return true;
                }
            }

            // Mark only the nodes having the SAME direction
            int current = i;

            while (current != -1
                    && nums[current] != 0
                    && (nums[current] > 0) == forward) {

                int next = nextIndex(nums, current, forward);

                nums[current] = 0;

                current = next;
            }
        }

        return false;
    }

    private int nextIndex(int[] nums, int current, boolean forward) {

        // Direction changed
        if ((nums[current] > 0) != forward) {
            return -1;
        }

        int n = nums.length;

        int next = (current + nums[current]) % n;

        if (next < 0) {
            next += n;
        }

        // One-element cycle
        if (next == current) {
            return -1;
        }

        return next;
    }
}