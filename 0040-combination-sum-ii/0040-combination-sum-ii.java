class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        combSum(0,candidates,new ArrayList<>(),target,ans);
        return ans;
    }

    void combSum(int i,int[] candidates,List<Integer> list,int target,List<List<Integer>> ans){
        if(target==0){
        ans.add(new ArrayList<>(list));
        return;
        }
        if(i==candidates.length)return;

        Arrays.sort(candidates);

        for (int j = i; j < candidates.length; j++) {

        if (j > i && candidates[j] == candidates[j - 1])
            continue;

        if (candidates[j] > target)
        break;

        list.add(candidates[j]);
        combSum(j + 1, candidates, list, target - candidates[j], ans);
        list.remove(list.size() - 1);
}

    }
}