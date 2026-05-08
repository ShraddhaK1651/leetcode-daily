class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>(); 
        generate(0,0,ans,"",n);
        return ans;
    }


    public void generate(int open,int close,List<String> ans,String s,int n){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
    
            if(open<n){
                generate(open+1,close,ans,s+"(",n);
            }
            if(close<open){
                generate(open,close+1,ans,s+")",n);
            }
    }
}
