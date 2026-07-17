class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> result=new ArrayList<>();
        int n=candidates.length;
        combSum(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    public void combSum(int i, int[] candidates, int target, List<Integer> ds,    List<List<Integer>> result){
        if(i==candidates.length){
            if(target==0){
                result.add(new ArrayList<>(ds));
            }
            return;
        }

        if(candidates[i]<=target){
            ds.add(candidates[i]);
            combSum(i, candidates, target-candidates[i], ds, result);
            ds.remove(ds.size()-1);
            
        }
            combSum(i+1, candidates, target, ds, result);

    }
}