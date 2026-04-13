class Solution {
    public int removeDuplicates(int[] nums) {
        // HashSet<Integer>set=new HashSet<>();
        List<Integer> ind = new ArrayList<>();
        int f=nums[0];
        ind.add(0);
        for(int j=1; j<nums.length; j++){
            if(f!=nums[j]){
                ind.add(j);
                f=nums[j];
            }
        }
        
        for(int i=0; i<ind.size(); i++){
            int k=ind.get(i);
            nums[i]=nums[k];
        }

        return ind.size();
    }
}