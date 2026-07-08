class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int canEat=n/2;
        int max=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            // if(set.contains(candyType[i])){
            //     max++;
            // }
            set.add(candyType[i]);
        }
            max=set.size();
            max=Math.min(max,canEat);

    
        return max;
    }
}