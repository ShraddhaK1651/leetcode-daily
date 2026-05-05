class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits==null || digits.length()==0)return result;
        String[] mapping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(0,new StringBuilder(),result,digits,mapping);
        return result;
    }

    public void backtrack(int i,StringBuilder s, List<String> result,String digits,String[] mapping){
        if(i==digits.length()){
            result.add(s.toString());
            return;
        }

        String letters=mapping[digits.charAt(i)-'0'];
        for(char ch:letters.toCharArray()){
            s.append(ch);
            backtrack(i+1,s,result,digits,mapping);
            s.deleteCharAt(s.length()-1);
        }
    }
}