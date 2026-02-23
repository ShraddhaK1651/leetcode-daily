class Solution {
    public String getSmallestString(int n, int k) {
        if(k<n || k>26*n){
            System.out.println(-1);
            return "";
        }
        char[] res=new char[n];
        Arrays.fill(res,'a');

        int remaining=k-n;
        for(int i=n-1;i>=0 && remaining>0;i--){
            int add=Math.min(25,remaining);
            res[i]=(char)(res[i]+add);
            remaining-=add;
        }
        return new String(res);
        
    }
}