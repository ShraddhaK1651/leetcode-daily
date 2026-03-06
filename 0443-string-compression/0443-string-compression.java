class Solution {
    public int compress(char[] chars) {
        String str=new String(chars);
        int n=str.length();
        int index=0;
        Integer count=1;
        for(int i=0;i<n;i++){
         while(i<n-1 && str.charAt(i)==str.charAt(i+1)){
            count++;
            i++;
        }
        chars[index++]=str.charAt(i);
        if(count>1){
            String cnt=count.toString();
        for(int j=0;j<cnt.length();j++){
            chars[index++]=cnt.charAt(j);
        }
        }
           count = 1; 
    }
    return index;

}
}