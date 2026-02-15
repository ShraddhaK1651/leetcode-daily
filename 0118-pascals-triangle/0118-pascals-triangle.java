class Solution{
    public List<List<Integer>>generate(int numRows){
        List<List<Integer>>Triangle=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                temp.add(generatesRows(i,j));
            }
            Triangle.add(temp);
        }
        return Triangle;
    }
public int generatesRows(int n,int r){
        int res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
    
}
