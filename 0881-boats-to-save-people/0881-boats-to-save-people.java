import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int i = 0;
        int j = people.length - 1;
        int boats = 0;

        while (i <= j) {

            // If the lightest and heaviest can share a boat
            if (people[i] + people[j] <= limit) {
                i++;
            }

            // The heaviest person always gets on a boat
            j--;
            boats++;
        }

        return boats;
    }
}