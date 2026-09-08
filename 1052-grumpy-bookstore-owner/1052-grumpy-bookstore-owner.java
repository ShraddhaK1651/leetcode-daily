class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int n = customers.length;

        int sum = 0;      // already satisfied
        int newSum = 0;   // extra satisfied in current window
        int maxNS = 0;    // maximum extra satisfied

        // Customers already satisfied
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                sum += customers[i];
            }
        }

        // First window
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                newSum += customers[i];
            }
        }

        maxNS = newSum;

        // Slide the window
        for (int i = minutes; i < n; i++) {

            // Add new element
            if (grumpy[i] == 1) {
                newSum += customers[i];
            }

            // Remove old element
            if (grumpy[i - minutes] == 1) {
                newSum -= customers[i - minutes];
            }

            maxNS = Math.max(maxNS, newSum);
        }

        return sum + maxNS;
    }
}