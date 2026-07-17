class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        backtrack(0,nums,new ArrayList<>());
        for(int i=0;i<ans.size();i++){
            set.add(ans.get(i));
        }
        return new ArrayList<>(set);
    }
    void backtrack(int start,int[] nums,List<Integer> curr){
        ans.add(new ArrayList<>(curr));
        Arrays.sort(nums);

for (int i = start; i < nums.length; i++) {
    if (i > start && nums[i] == nums[i - 1]) {
        continue;
    }

    curr.add(nums[i]);
    backtrack(i + 1, nums, curr);
    curr.remove(curr.size() - 1);
}
    }
}