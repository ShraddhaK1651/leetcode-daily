class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int index=0;
        int[] ans=new int[n];
        int k=0;

       // smaller
        for (int num : nums) {
            if (num < pivot)
                ans[k++] = num;
        }

        // equal
        for (int num : nums) {
            if (num == pivot)
                ans[k++] = num;
        }

        // greater
        for (int num : nums) {
            if (num > pivot)
                ans[k++] = num;
        }
        return ans;
    }
}