class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxArea=0;
        int currArea=0;
        int i=0;
        int j=n-1;
        int width=0;
        int ht=0;
        while(i<j){
        width=Math.abs(i-j);
        ht=Math.min(height[i],height[j]);
        currArea=width*ht;
        maxArea=Math.max(currArea,maxArea);
        if(height[i]<height[j])i++;
        else j--;
        }
        return maxArea;
    }
}