class Solution {
    public boolean isHappy(int n) {
       
        HashSet<Integer> set=new HashSet<>();
        while(n!=1){
             
            if(set.contains(n)){
                return false;
            }
            int sum=0;
              set.add(n);
            while(n!=0){
            int num=n%10;
            sum+=(num*num);
            n=n/10;
        }
      
        n=sum;
        }
        return true;
    }
}