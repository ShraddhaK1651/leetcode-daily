// class Solution {
//     public boolean check(int[] nums) {
//         int breakpoint=0;
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]>nums[i+1]){
//                 breakpoint=i+1;
//             }
//             isSorted1(nums,breakpoint,nums.length-1);
//             isSorted2(nums,0,breakpoint-1);
//             if(isSorted1(nums,breakpoint,nums.length-1)==true && isSorted2(nums,0,breakpoint-1)==true ){
//                 return true;
//             }

//         }
//         return false;
//     }
//     public boolean isSorted1(int[] nums,int left,int right){
//         for(int i=left;i<right;i++){
//             if(nums[i]<nums[i+1]){
//                 return true;
//             }
           
//         }
//          return true;
//     }

//     public boolean isSorted2(int[] nums,int left,int right){
//         for(int i=left;i<right;i++){
//             if(nums[i]<nums[i+1]){
//                 return true;
//             }
           
//         }
//          return true;
//     }


// }

class Solution {
    public boolean check(int[] nums) {
        int breakpoint = 0;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                breakpoint = i + 1;
                count++;
            }
        }

        // More than one break → not sorted & rotated
        if (count > 1) return false;

        // Check both halves
        return isSorted1(nums, breakpoint, nums.length - 1)
            && isSorted2(nums, 0, breakpoint - 1)
            && (breakpoint == 0 || nums[nums.length - 1] <= nums[0]);
    }

    public boolean isSorted1(int[] nums, int left, int right) {
        for (int i = left; i < right; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean isSorted2(int[] nums, int left, int right) {
        for (int i = left; i < right; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
