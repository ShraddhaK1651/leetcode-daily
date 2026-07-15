class Solution {
    public String removeOuterParentheses(String s) {
        int cnt=0;
        StringBuilder sb = new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(!st.isEmpty()){
                    sb.append(ch);
                }
                st.push(ch);
            }
            if(ch==')'){
                st.pop();
                if(!st.isEmpty())sb.append(ch);
            }
        }
        
        return sb.toString();


    }
}